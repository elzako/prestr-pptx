package com.aspose.slides.internal.j0e;

import com.aspose.slides.Collections.Stack;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.l7h.a5;
import com.aspose.slides.internal.v6g.u9;
import com.aspose.slides.internal.z0k.y1;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.t9;
import com.aspose.slides.ms.System.u3;

public class n5 {
   private n5$l6 n5;
   private y1 l6;
   private Stack k5 = new Stack();
   private Stack u3 = new Stack();
   private String a6;
   private a5 u9 = new a5(200);
   private char[] h0 = new char[30];
   private boolean c8;
   private n5$k5 t2 = new n5$k5(null);
   private int s7 = 1;
   private int x8;
   private boolean n3;
   private static final u9 y4 = new u9("amp", "quot", "apos", "lt", "gt");

   private Exception n5(String var1) {
      return new l6(var1, this.s7, this.x8);
   }

   private Exception u3() {
      String[] var1 = new String[this.k5.size()];
      this.k5.copyTo(com.aspose.slides.ms.System.u3.n5((Object)(var1)), 0);
      return this.n5(d1.n5("Unexpected end of stream. Element stack content is {0}", new Object[]{d1.n5(",", var1)}));
   }

   private boolean n5(char var1, boolean var2) {
      switch (var1) {
         case '-':
         case '.':
            return !var2;
         case ':':
         case '_':
            return true;
         default:
            if (var1 > 256) {
               switch (var1) {
                  case 'ՙ':
                  case 'ۥ':
                  case 'ۦ':
                     return true;
                  default:
                     if (699 <= var1 && var1 <= 705) {
                        return true;
                     }
               }
            }

            switch (t9.l6(var1)) {
               case 0:
               case 1:
               case 2:
               case 4:
               case 9:
                  return true;
               case 3:
               case 5:
               case 6:
               case 7:
               case 8:
                  return !var2;
               default:
                  return false;
            }
      }
   }

   private boolean l6(int var1) {
      switch (var1) {
         case 9:
         case 10:
         case 13:
         case 32:
            return true;
         default:
            return false;
      }
   }

   public void n5() {
      this.n5(false);
   }

   private void a6() {
      while (this.l6(this.u9())) {
         this.u9.n5((char)this.h0());
      }

      if (this.u9() != 60 && this.u9() >= 0) {
         this.c8 = false;
      }
   }

   public void n5(boolean var1) {
      while (true) {
         switch (this.u9()) {
            case 9:
            case 10:
            case 13:
            case 32:
               this.h0();
               if (var1) {
                  var1 = false;
               }
               break;
            default:
               if (var1) {
                  throw this.n5("Whitespace is expected.");
               }

               return;
         }
      }
   }

   private int u9() {
      return this.l6.a6();
   }

   private int h0() {
      int var1 = this.l6.u9();
      if (var1 == 10) {
         this.n3 = true;
      }

      if (this.n3) {
         this.s7++;
         this.n3 = false;
         this.x8 = 1;
      } else {
         this.x8++;
      }

      return var1;
   }

   public void n5(int var1) {
      int var2 = this.h0();
      if (var2 < 0) {
         throw this.u3();
      }

      if (var2 != var1) {
         throw this.n5(d1.n5("Expected '{0}' but got {1}",new Object[]{ (char)var1, (char)var2}));
      }
   }

   private String l6(char var1, boolean var2) {
      while (this.u9() >= 0) {
         char var3 = (char)this.h0();
         if (var3 == var1) {
            String var4 = this.u9.toString();
            this.u9.n5(0);
            return var4;
         }

         if (var2 && var3 == '&') {
            this.x8();
         } else {
            this.u9.n5(var3);
         }
      }

      throw this.u3();
   }

   public String l6() {
      int var1 = 0;
      if (this.u9() >= 0 && this.n5((char)this.u9(), true)) {
         for (int var2 = this.u9(); var2 >= 0; var2 = this.u9()) {
            char var3 = (char)var2;
            if (!this.n5(var3, false)) {
               break;
            }

            if (var1 == this.h0.length) {
               char[] var4 = new char[var1 * 2];
               com.aspose.slides.ms.System.u3.n5(this.h0, 0, var4, 0, var1);
               this.h0 = var4;
            }

            this.h0[var1++] = var3;
            this.h0();
         }

         if (var1 == 0) {
            throw this.n5("Valid XML name is expected.");
         } else {
            return d1.n5(this.h0, 0, var1);
         }
      } else {
         throw this.n5("XML name start character is expected.");
      }
   }

   public void n5(y1 var1, n5$l6 var2) {
      this.l6 = var1;
      this.n5 = var2;
      var2.n5(this);

      while (this.u9() >= 0) {
         this.k5();
      }

      this.t2();
      if (this.k5.size() > 0) {
         throw this.n5(d1.n5("Insufficient close tag: {0}", new Object[]{this.k5.peek()}));
      }

      var2.l6(this);
      this.c8();
   }

   private void c8() {
      this.s7 = 1;
      this.x8 = 0;
      this.n5 = null;
      this.l6 = null;
      this.k5.clear();
      this.u3.clear();
      this.t2.n5();
      this.u9.n5(0);
      this.a6 = null;
      this.c8 = false;
   }

   public void k5() {
      if (this.l6(this.u9())) {
         if (this.u9.l6() == 0) {
            this.c8 = true;
         }

         this.a6();
      }

      if (this.u9() != 60) {
         this.s7();
      } else {
         this.h0();
         switch (this.u9()) {
            case 33:
               this.h0();
               if (this.u9() == 91) {
                  this.h0();
                  if (!"CDATA".equals(this.l6())) {
                     throw this.n5("Invalid declaration markup");
                  }

                  this.n5(91);
                  this.y4();
                  return;
               } else if (this.u9() == 45) {
                  this.e2();
                  return;
               } else {
                  if (!"DOCTYPE".equals(this.l6())) {
                     throw this.n5("Invalid declaration markup.");
                  }

                  throw this.n5("This parser does not support document type.");
               }
            case 47:
               this.t2();
               if (this.k5.size() == 0) {
                  throw this.u3();
               } else {
                  this.h0();
                  String var5 = this.l6();
                  this.n5();
                  String var3 = (String)this.k5.pop();
                  this.u3.pop();
                  if (this.u3.size() > 0) {
                     this.a6 = (String)this.u3.peek();
                  } else {
                     this.a6 = null;
                  }

                  if (!d1.a6(var5, var3)) {
                     throw this.n5(d1.n5("End tag mismatch: expected {0} but found {1}",new Object[]{ var3, var5}));
                  }

                  this.n5.n5(var5);
                  this.n5(62);
                  return;
               }
            case 63:
               this.t2();
               this.h0();
               String var4 = this.l6();
               this.n5();
               String var2 = d1.n5;
               if (this.u9() != 63) {
                  while (true) {
                     var2 = d1.n5(var2, this.l6('?', false));
                     if (this.u9() == 62) {
                        break;
                     }

                     var2 = d1.n5(var2, "?");
                  }
               }

               this.n5.n5(var4, var2);
               this.n5(62);
               return;
            default:
               this.t2();
               String var1 = this.l6();

               while (this.u9() != 62 && this.u9() != 47) {
                  this.n5(this.t2);
               }

               this.n5.n5(var1, this.t2);
               this.t2.n5();
               this.n5();
               if (this.u9() == 47) {
                  this.h0();
                  this.n5.n5(var1);
               } else {
                  this.k5.push(var1);
                  this.u3.push(this.a6);
               }

               this.n5(62);
         }
      }
   }

   private void t2() {
      if (this.u9.l6() != 0) {
         if (this.c8) {
            this.n5.k5(this.u9.toString());
         } else {
            this.n5.l6(this.u9.toString());
         }

         this.u9.n5(0);
         this.c8 = false;
      }
   }

   private void s7() {
      this.c8 = false;

      while (true) {
         int var1 = this.u9();
         switch (var1) {
            case -1:
               return;
            case 38:
               this.h0();
               this.x8();
               break;
            case 60:
               return;
            default:
               this.u9.n5((char)this.h0());
         }
      }
   }

   private void x8() {
      if (this.u9() == 35) {
         this.h0();
         this.n3();
      } else {
         String var1 = this.l6();
         this.n5(59);
         switch (y4.n5(var1)) {
            case 0:
               this.u9.n5('&');
               break;
            case 1:
               this.u9.n5('"');
               break;
            case 2:
               this.u9.n5('\'');
               break;
            case 3:
               this.u9.n5('<');
               break;
            case 4:
               this.u9.n5('>');
               break;
            default:
               throw this.n5("General non-predefined entity reference is not supported in this parser.");
         }
      }
   }

   private int n3() {
      int var1 = 0;
      if (this.u9() == 120) {
         this.h0();

         for (int var2 = this.u9(); var2 >= 0; var2 = this.u9()) {
            if (48 <= var2 && var2 <= 57) {
               var1 <<= 4 + var2 - 48;
            } else if (65 <= var2 && var2 <= 70) {
               var1 <<= 4 + var2 - 65 + 10;
            } else {
               if (97 > var2 || var2 > 102) {
                  break;
               }

               var1 <<= 4 + var2 - 97 + 10;
            }

            this.h0();
         }
      } else {
         for (int var3 = this.u9(); var3 >= 0 && 48 <= var3 && var3 <= 57; var3 = this.u9()) {
            var1 <<= 4 + var3 - 48;
            this.h0();
         }
      }

      return var1;
   }

   private void n5(n5$k5 var1) {
      this.n5(true);
      if (this.u9() != 47 && this.u9() != 62) {
         String var2 = this.l6();
         this.n5();
         this.n5(61);
         this.n5();
         String var3;
         switch (this.h0()) {
            case 34:
               var3 = this.l6('"', true);
               break;
            case 39:
               var3 = this.l6('\'', true);
               break;
            default:
               throw this.n5("Invalid attribute value markup.");
         }

         if ("xml:space".equals(var2)) {
            this.a6 = var3;
         }

         var1.n5(var2, var3);
      }
   }

   private void y4() {
      int var1 = 0;

      while (this.u9() >= 0) {
         char var2 = (char)this.h0();
         if (var2 == ']') {
            var1++;
         } else {
            if (var2 == '>' && var1 > 1) {
               for (int var4 = var1; var4 > 2; var4--) {
                  this.u9.n5(']');
               }

               return;
            }

            for (int var3 = 0; var3 < var1; var3++) {
               this.u9.n5(']');
            }

            var1 = 0;
            this.u9.n5(var2);
         }
      }

      throw this.u3();
   }

   private void e2() {
      this.n5(45);
      this.n5(45);

      while (true) {
         if (this.h0() == 45) {
            if (this.h0() == 45) {
               if (this.h0() != 62) {
                  throw this.n5("'--' is not allowed inside comment markup.");
               }

               return;
            }
            continue;
         }
      }
   }
}
