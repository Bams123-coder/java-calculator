package calculator;

import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.LinkedList;

public class Parser {
   private String input;
   private String output;
   private String converted;
   private String Precision_str;
   private int precision = 16;
   private int mode = 1;
   private double xValue;
   private double logBase = 10.0D;
   private final char pi = 'p';
   private final char e = 'e';
   private final char sin = 's';
   private final char cos = 'c';
   private final char tan = 't';
   private final char log = 'l';
   private final char sqr = 'q';
   private final char exp = '^';
   private final char abs = 'a';
   private final char asin = 'S';
   private final char acos = 'C';
   private final char atan = 'T';
   private final char csc = 'P';
   private final char sec = 'Q';
   private final char cot = 'R';
   private final char x = 'x';

   public Parser() {
      this.setPrecision(this.precision);
      this.setLogBase(this.logBase);
      this.setMode(this.mode);
   }

   public String solve(String expression, Double x) {
      this.input = expression;
      this.xValue = x;
      this.purify();
      this.removePars();
      this.output = this.toString(this.evaluate(this.input + "="));
      return this.output;
   }

   private void removePars() {
      try {
         boolean foundEndPars = false;
         int beginPars = 0;
         int endPars = 0;

         while(beginPars != -1 && endPars != -1) {
            foundEndPars = false;
            beginPars = this.input.indexOf("(");
            endPars = beginPars;
            if (beginPars != -1) {
               while(!foundEndPars) {
                  ++endPars;
                  switch(this.input.charAt(endPars)) {
                  case '(':
                     beginPars = endPars;
                     break;
                  case ')':
                     foundEndPars = true;
                  }
               }

               String inPars = this.input.substring(beginPars + 1, endPars);
               this.input = this.input.substring(0, beginPars) + this.evaluate(inPars + "=") + this.input.substring(endPars + 1, this.input.length());
               this.noMultipleNegatives();
            }
         }
      } catch (Exception var5) {
         this.input = "NaN";
      }

   }

   private void addPars() {
      int beginParCount = 0;
      int endParCount = 0;

      int i;
      for(i = 0; i < this.input.length(); ++i) {
         switch(this.input.charAt(i)) {
         case '(':
            ++beginParCount;
            break;
         case ')':
            ++endParCount;
         }
      }

      if (endParCount < beginParCount) {
         for(i = 0; i < beginParCount - endParCount; ++i) {
            this.input = this.input + ")";
         }
      }

   }

   private double evaluate(String expression) {
      try {
         if (expression.indexOf("Infinity") != -1) {
            return Double.POSITIVE_INFINITY;
         } else if (expression.indexOf("NaN") != -1) {
            return Math.sqrt(-1.0D);
         } else {
            int i = 0;
            String Num = "";
            LinkedList<Double> Nums = new LinkedList();
            LinkedList Ops = new LinkedList();

            do {
               char index = expression.charAt(i);
               ++i;
               switch(index) {
               case '*':
               case '+':
               case '-':
               case '/':
               case '^':
                  if (Num.length() != 0 && this.confirmNegative(Num, expression, i)) {
                     Nums.add(this.parseNumber(Num));
                     Num = "";
                     Ops.add(index);
                  } else if (index == '-') {
                     Num = Num + '-';
                  }
               case ',':
               case ':':
               case ';':
               case '<':
               case '>':
               case '?':
               case '@':
               case 'A':
               case 'B':
               case 'D':
               case 'F':
               case 'G':
               case 'H':
               case 'I':
               case 'J':
               case 'K':
               case 'L':
               case 'M':
               case 'N':
               case 'O':
               case 'U':
               case 'V':
               case 'W':
               case 'X':
               case 'Y':
               case 'Z':
               case '[':
               case '\\':
               case ']':
               case '_':
               case '`':
               case 'b':
               case 'd':
               case 'e':
               case 'f':
               case 'g':
               case 'h':
               case 'i':
               case 'j':
               case 'k':
               case 'm':
               case 'n':
               case 'o':
               case 'p':
               case 'r':
               default:
                  break;
               case '.':
               case '0':
               case '1':
               case '2':
               case '3':
               case '4':
               case '5':
               case '6':
               case '7':
               case '8':
               case '9':
               case 'C':
               case 'E':
               case 'P':
               case 'Q':
               case 'R':
               case 'S':
               case 'T':
               case 'a':
               case 'c':
               case 'l':
               case 'q':
               case 's':
               case 't':
                  Num = Num + index;
                  break;
               case '=':
                  Nums.add(this.parseNumber(Num));
               }
            } while(i < expression.length());

            double result = (Double)Nums.get(0);
            Nums.remove(0);
            Iterator var9 = Ops.iterator();

            while(var9.hasNext()) {
               char a = (Character)var9.next();
               switch(a) {
               case '*':
                  result *= (Double)Nums.get(0);
                  Nums.remove(0);
                  break;
               case '+':
                  result += (Double)Nums.get(0);
                  Nums.remove(0);
                  break;
               case '-':
                  result -= (Double)Nums.get(0);
                  Nums.remove(0);
                  break;
               case '/':
                  result /= (Double)Nums.get(0);
                  Nums.remove(0);
                  break;
               case '^':
                  result = Math.pow(result, (Double)Nums.get(0));
                  Nums.remove(0);
               }
            }

            DecimalFormat DForm = new DecimalFormat(this.getPrecisionString());
            result = Double.valueOf(DForm.format(result));
            return result;
         }
      } catch (Exception var11) {
         return Math.sqrt(-1.0D);
      }
   }

   private double parseNumber(String Num) {
      double result = 0.0D;
      DecimalFormat DForm = new DecimalFormat(this.getPrecisionString());

      try {
         switch(Num.charAt(0)) {
         case '-':
            result = this.negativeFunction(Num);
            break;
         case 'C':
            Num = Num.substring(1, Num.length());
            result = Math.acos(Double.parseDouble(Num));
            if (this.mode == 2) {
               result = Math.acos(Double.parseDouble(Num)) * 57.29577951308232D;
            }
            break;
         case 'P':
            Num = Num.substring(1, Num.length());
            result = 1.0D / Math.sin(Double.parseDouble(Num));
            if (this.mode == 2) {
               result = 1.0D / Math.sin(Double.parseDouble(Num) / 57.29577951308232D);
            }
            break;
         case 'Q':
            Num = Num.substring(1, Num.length());
            result = 1.0D / Math.cos(Double.parseDouble(Num));
            if (this.mode == 2) {
               result = 1.0D / Math.cos(Double.parseDouble(Num) / 57.29577951308232D);
            }
            break;
         case 'R':
            Num = Num.substring(1, Num.length());
            result = 1.0D / Math.tan(Double.parseDouble(Num));
            if (this.mode == 2) {
               result = 1.0D / Math.tan(Double.parseDouble(Num) / 57.29577951308232D);
            }
            break;
         case 'S':
            Num = Num.substring(1, Num.length());
            result = Math.asin(Double.parseDouble(Num));
            if (this.mode == 2) {
               result = Math.asin(Double.parseDouble(Num)) * 57.29577951308232D;
            }
            break;
         case 'T':
            Num = Num.substring(1, Num.length());
            result = Math.atan(Double.parseDouble(Num));
            if (this.mode == 2) {
               result = Math.atan(Double.parseDouble(Num)) * 57.29577951308232D;
            }
            break;
         case 'a':
            Num = Num.substring(1, Num.length());
            result = Math.abs(Double.parseDouble(Num));
            break;
         case 'c':
            Num = Num.substring(1, Num.length());
            result = Math.cos(Double.parseDouble(Num));
            if (this.mode == 2) {
               result = Math.cos(Double.parseDouble(Num) / 57.29577951308232D);
            }
            break;
         case 'l':
            Num = Num.substring(1, Num.length());
            result = Math.log(Double.parseDouble(Num)) / Math.log(this.logBase);
            break;
         case 'q':
            Num = Num.substring(1, Num.length());
            result = Math.sqrt(Double.parseDouble(Num));
            break;
         case 's':
            Num = Num.substring(1, Num.length());
            result = Math.sin(Double.parseDouble(Num));
            if (this.mode == 2) {
               result = Math.sin(Double.parseDouble(Num) / 57.29577951308232D);
            }
            break;
         case 't':
            Num = Num.substring(1, Num.length());
            result = Math.tan(Double.parseDouble(Num));
            if (this.mode == 2) {
               result = Math.tan(Double.parseDouble(Num) / 57.29577951308232D);
            }
            break;
         default:
            result = Double.parseDouble(Num);
         }

         result = Double.valueOf(DForm.format(result));
         return result;
      } catch (Exception var6) {
         return Math.sqrt(Double.parseDouble("-1"));
      }
   }

   private double negativeFunction(String Num) {
      double result = 0.0D;
      switch(Num.charAt(1)) {
      case 'C':
      case 'P':
      case 'Q':
      case 'R':
      case 'S':
      case 'T':
      case 'a':
      case 'c':
      case 'l':
      case 'q':
      case 's':
      case 't':
         Num = "" + this.parseNumber(Num.substring(1, Num.length())) * -1.0D;
         result = Double.parseDouble(Num);
         break;
      case 'D':
      case 'E':
      case 'F':
      case 'G':
      case 'H':
      case 'I':
      case 'J':
      case 'K':
      case 'L':
      case 'M':
      case 'N':
      case 'O':
      case 'U':
      case 'V':
      case 'W':
      case 'X':
      case 'Y':
      case 'Z':
      case '[':
      case '\\':
      case ']':
      case '^':
      case '_':
      case '`':
      case 'b':
      case 'd':
      case 'e':
      case 'f':
      case 'g':
      case 'h':
      case 'i':
      case 'j':
      case 'k':
      case 'm':
      case 'n':
      case 'o':
      case 'p':
      case 'r':
      default:
         result = Double.parseDouble(Num);
      }

      return result;
   }

   private boolean confirmNegative(String Num, String expression, int i) {
      boolean result = false;
      if (expression.charAt(i - 2) != 's' && expression.charAt(i - 2) != 'c' && expression.charAt(i - 2) != 't' && expression.charAt(i - 2) != 'l' && expression.charAt(i - 2) != 'q' && expression.charAt(i - 2) != 'a' && expression.charAt(i - 2) != 'S' && expression.charAt(i - 2) != 'C' && expression.charAt(i - 2) != 'T' && expression.charAt(i - 2) != 'P' && expression.charAt(i - 2) != 'Q' && expression.charAt(i - 2) != 'R' && expression.charAt(i - 2) != 'E') {
         result = true;
      }

      return result;
   }

   private void addTimesChar() {
      int i = 0;
      byte lastItem = 88;

      do {
         char index = this.input.charAt(i);
         ++i;
         switch(index) {
         case '(':
         case 'C':
         case 'P':
         case 'Q':
         case 'R':
         case 'S':
         case 'T':
         case 'a':
         case 'c':
         case 'l':
         case 'q':
         case 's':
         case 't':
            if (lastItem == 78 || lastItem == 41) {
               this.input = this.input.substring(0, i - 1) + "*" + this.input.substring(i - 1, this.input.length());
               ++i;
               lastItem = 88;
            }
            break;
         case ')':
            lastItem = 41;
            break;
         case '*':
         case '+':
         case '-':
         case '/':
         case '^':
            lastItem = 79;
         case ',':
         case ':':
         case ';':
         case '<':
         case '=':
         case '>':
         case '?':
         case '@':
         case 'A':
         case 'B':
         case 'D':
         case 'E':
         case 'F':
         case 'G':
         case 'H':
         case 'I':
         case 'J':
         case 'K':
         case 'L':
         case 'M':
         case 'N':
         case 'O':
         case 'U':
         case 'V':
         case 'W':
         case 'X':
         case 'Y':
         case 'Z':
         case '[':
         case '\\':
         case ']':
         case '_':
         case '`':
         case 'b':
         case 'd':
         case 'e':
         case 'f':
         case 'g':
         case 'h':
         case 'i':
         case 'j':
         case 'k':
         case 'm':
         case 'n':
         case 'o':
         case 'p':
         case 'r':
         default:
            break;
         case '.':
         case '0':
         case '1':
         case '2':
         case '3':
         case '4':
         case '5':
         case '6':
         case '7':
         case '8':
         case '9':
            if (lastItem == 41) {
               this.input = this.input.substring(0, i - 1) + "*" + this.input.substring(i - 1, this.input.length());
               ++i;
            }

            lastItem = 78;
         }
      } while(i < this.input.length());

   }

   private void removeConstantsandVars() {
      int i = 0;
      byte lastItem = 88;

      try {
         do {
            char index = this.input.charAt(i);
            ++i;
            switch(index) {
            case '*':
            case '+':
            case '-':
            case '/':
            case '^':
               lastItem = 79;
            case ',':
            case ':':
            case ';':
            case '<':
            case '=':
            case '>':
            case '?':
            case '@':
            case 'A':
            case 'B':
            case 'C':
            case 'D':
            case 'E':
            case 'F':
            case 'G':
            case 'H':
            case 'I':
            case 'J':
            case 'K':
            case 'L':
            case 'M':
            case 'N':
            case 'O':
            case 'P':
            case 'Q':
            case 'R':
            case 'S':
            case 'T':
            case 'U':
            case 'V':
            case 'W':
            case 'X':
            case 'Y':
            case 'Z':
            case '[':
            case '\\':
            case ']':
            case '_':
            case '`':
            case 'a':
            case 'b':
            case 'c':
            case 'd':
            case 'f':
            case 'g':
            case 'h':
            case 'i':
            case 'j':
            case 'k':
            case 'l':
            case 'm':
            case 'n':
            case 'o':
            case 'q':
            case 'r':
            case 's':
            case 't':
            case 'u':
            case 'v':
            case 'w':
            default:
               break;
            case '.':
            case '0':
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9':
               if (lastItem == 67) {
                  this.input = this.input.substring(0, i - 1) + "*" + this.input.substring(i - 1, this.input.length());
                  ++i;
               }

               lastItem = 78;
               break;
            case 'e':
            case 'p':
            case 'x':
               if (lastItem == 78) {
                  this.input = this.input.substring(0, i - 1) + "*" + this.input.substring(i - 1, this.input.length());
                  ++i;
               }

               lastItem = 67;
            }
         } while(i < this.input.length());

         this.input = this.input.replace(Character.toString('p'), "3.141592653589793");
         this.input = this.input.replace(Character.toString('e'), "2.718281828459045");

         for(int k = 0; k < 2; ++k) {
            this.input = this.input.replaceAll("xx", "x*x");
         }

         this.input = this.input.replace(Character.toString('x'), Double.toString(this.xValue));
      } catch (Exception var5) {
         this.input = "NaN";
      }

   }

   private void noMultipleNegatives() {
      int minusCount = 0;

      for(int i = 0; i < this.input.length(); ++i) {
         char index = this.input.charAt(i);
         switch(index) {
         case '-':
            ++minusCount;
            if (minusCount > 1) {
               this.input = this.input.replace("--", "+");
               this.input = this.input.replace("-(-", "+");
            }
            break;
         case '.':
         case '0':
         case '1':
         case '2':
         case '3':
         case '4':
         case '5':
         case '6':
         case '7':
         case '8':
         case '9':
         case 'C':
         case 'P':
         case 'Q':
         case 'R':
         case 'S':
         case 'T':
         case 'a':
         case 'c':
         case 'e':
         case 'l':
         case 'p':
         case 'q':
         case 's':
         case 't':
         case 'x':
            minusCount = 0;
         case '/':
         case ':':
         case ';':
         case '<':
         case '=':
         case '>':
         case '?':
         case '@':
         case 'A':
         case 'B':
         case 'D':
         case 'E':
         case 'F':
         case 'G':
         case 'H':
         case 'I':
         case 'J':
         case 'K':
         case 'L':
         case 'M':
         case 'N':
         case 'O':
         case 'U':
         case 'V':
         case 'W':
         case 'X':
         case 'Y':
         case 'Z':
         case '[':
         case '\\':
         case ']':
         case '^':
         case '_':
         case '`':
         case 'b':
         case 'd':
         case 'f':
         case 'g':
         case 'h':
         case 'i':
         case 'j':
         case 'k':
         case 'm':
         case 'n':
         case 'o':
         case 'r':
         case 'u':
         case 'v':
         case 'w':
         }
      }

   }

   private String toString(double number) {
      String result = "";
      if (!Double.toString(number).equals("NaN") && !Double.toString(number).equals("Infinity")) {
         result = Double.toString(number);
         if (result.substring(result.length() - 2, result.length()).equals(".0")) {
            result = result.substring(0, result.length() - 2);
         }

         if (result.equals("-0")) {
            result = "0";
         }
      } else {
         result = "Error";
      }

      return result;
   }

   private void purify() {
      this.convert();
      this.noMultipleNegatives();
      this.addPars();
      this.removeConstantsandVars();
      this.addTimesChar();
      this.noMultipleNegatives();
   }

   private void convert() {
      this.input = this.input.replace(" ", "");
      this.input = this.input.replace(")x", ")*x");
      this.input = this.input.replace("asin(", "S(");
      this.input = this.input.replace("acos(", "C(");
      this.input = this.input.replace("atan(", "T(");
      this.input = this.input.replace("sin(", "s(");
      this.input = this.input.replace("cos(", "c(");
      this.input = this.input.replace("tan(", "t(");
      this.input = this.input.replace("log(", "l(");
      this.input = this.input.replace("csc(", "P(");
      this.input = this.input.replace("sec(", "Q(");
      this.input = this.input.replace("cot(", "R(");
      this.input = this.input.replace("abs(", "a(");
      this.input = this.input.replace("π", "p");
      this.input = this.input.replace("√", "q");
   }

   public void setMode(int M) {
      if (M != 2 && M != 1) {
         this.mode = 1;
      } else {
         this.mode = M;
      }

   }

   public int getMode() {
      return this.mode;
   }

   public void setPrecision(int prec) {
      String result = "#.";
      if (prec > 0 && prec < 17) {
         this.precision = prec;

         for(int i = 0; i < this.precision; ++i) {
            result = result + "#";
         }

         this.Precision_str = result;
      }

   }

   public int getPrecision() {
      return this.precision;
   }

   private String getPrecisionString() {
      this.setPrecision(this.precision);
      return this.Precision_str;
   }

   public void setLogBase(double lb) {
      this.logBase = lb;
   }

   public double getLogBase() {
      return this.logBase;
   }
}
