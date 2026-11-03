package com.aspose.slides.internal.b3;

import com.aspose.slides.ms.System.d1;

public class r4 {
   protected int n5 = 0;
   protected String l6 = null;
   protected int k5 = 0;
   private int u3 = 0;
   private String a6;
   private int u9 = 0;
   private int h0;
   private static final String c8 = d1.n5(new String[]{"0123456789", "abcdefABCDEF"});

   public r4(String var1) {
      this.a6 = var1;
      this.h0 = var1.length();
   }

   public final void n5() {
      this.l6 = null;
      this.u3 = this.u9;

      while (this.u9 < this.h0) {
         char var1 = this.a6.charAt(this.u9++);
         switch (var1) {
            case '\t':
            case '\n':
            case '\r':
            case ' ':
               this.u3 = this.u9;
               break;
            case '\u000b':
            case '\f':
            case '\u000e':
            case '\u000f':
            case '\u0010':
            case '\u0011':
            case '\u0012':
            case '\u0013':
            case '\u0014':
            case '\u0015':
            case '\u0016':
            case '\u0017':
            case '\u0018':
            case '\u0019':
            case '\u001a':
            case '\u001b':
            case '\u001c':
            case '\u001d':
            case '\u001e':
            case '\u001f':
            case '!':
            case '$':
            case '%':
            case '&':
            case '/':
            default:
               this.u9--;
               this.u3();
               if (this.u9 == this.u3) {
                  throw new z8("illegal character");
               }

               this.l6 = com.aspose.slides.internal.v3.x8.n5(this.a6, this.u3, this.u9);
               if (d1.a6(this.l6, "mod")) {
                  this.n5 = 10;
                  return;
               }

               if (d1.a6(this.l6, "div")) {
                  this.n5 = 11;
                  return;
               }

               if (this.c8()) {
                  this.n5 = 7;
               } else {
                  this.n5 = 1;
               }

               return;
            case '"':
            case '\'':
               this.u9 = d1.l6(this.a6, var1, this.u9);
               if (this.u9 < 0) {
                  this.u9 = this.u3 + 1;
                  throw new z8("missing quote");
               }

               this.l6 = com.aspose.slides.internal.v3.x8.n5(this.a6, this.u3 + 1, this.u9++);
               this.n5 = 5;
               return;
            case '#':
               this.k5();
               return;
            case '(':
               this.n5 = 3;
               return;
            case ')':
               this.n5 = 4;
               return;
            case '*':
               this.n5 = 2;
               return;
            case '+':
               this.n5 = 8;
               return;
            case ',':
               this.n5 = 13;
               return;
            case '-':
               this.n5 = 9;
               return;
            case '.':
               this.l6();
               return;
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
               this.u9();
               boolean var2;
               if (this.u9 < this.h0 && this.a6.charAt(this.u9) == '.') {
                  this.u9++;
                  var2 = true;
                  if (this.u9 < this.h0 && n5(this.a6.charAt(this.u9))) {
                     this.u9++;
                     this.u9();
                  }
               } else {
                  var2 = false;
               }

               if (this.u9 < this.h0 && this.a6.charAt(this.u9) == '%') {
                  this.u9++;
                  this.n5 = 14;
               } else {
                  this.k5 = this.u9;
                  this.u3();
                  this.k5 = this.u9 - this.k5;
                  this.n5 = this.k5 > 0 ? 12 : (var2 ? 16 : 17);
               }

               this.l6 = com.aspose.slides.internal.v3.x8.n5(this.a6, this.u3, this.u9);
               return;
         }
      }

      this.n5 = 0;
   }

   private void l6() {
      if (this.u9 < this.h0 && n5(this.a6.charAt(this.u9))) {
         this.u9++;
         this.u9();
         if (this.u9 < this.h0 && this.a6.charAt(this.u9) == '%') {
            this.u9++;
            this.n5 = 14;
         } else {
            this.k5 = this.u9;
            this.u3();
            this.k5 = this.u9 - this.k5;
            this.n5 = this.k5 > 0 ? 12 : 16;
         }

         this.l6 = com.aspose.slides.internal.v3.x8.n5(this.a6, this.u3, this.u9);
      } else {
         throw new z8("illegal character '.'");
      }
   }

   private void k5() {
      if (this.u9 >= this.h0) {
         throw new z8("illegal character '#'");
      }

      this.u9++;
      this.h0();
      int var1 = this.u9 - this.u3 - 1;
      if (var1 % 3 != 0 && var1 % 4 != 0) {
         this.a6();
         this.n5 = 1;
      } else {
         this.n5 = 15;
      }

      this.l6 = com.aspose.slides.internal.v3.x8.n5(this.a6, this.u3, this.u9);
   }

   private void u3() {
      if (this.u9 < this.h0 && k5(this.a6.charAt(this.u9))) {
         this.a6();
      }
   }

   private void a6() {
      while (++this.u9 < this.h0 && u3(this.a6.charAt(this.u9))) {
      }
   }

   private void u9() {
      while (this.u9 < this.h0 && n5(this.a6.charAt(this.u9))) {
         this.u9++;
      }
   }

   private void h0() {
      while (this.u9 < this.h0 && l6(this.a6.charAt(this.u9))) {
         this.u9++;
      }
   }

   private boolean c8() {
      for (int var1 = this.u9; var1 < this.h0; var1++) {
         switch (this.a6.charAt(var1)) {
            case '\t':
            case '\n':
            case '\r':
            case ' ':
            case '(':
               this.u9 = var1 + 1;
               return true;
            default:
               return false;
         }
      }

      return false;
   }

   private static boolean n5(char var0) {
      return d1.u3("0123456789", var0) >= 0;
   }

   private static boolean l6(char var0) {
      return d1.u3(c8, var0) >= 0;
   }

   private static boolean k5(char var0) {
      return d1.u3("_abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ", var0) >= 0 || var0 >= 128;
   }

   private static boolean u3(char var0) {
      return d1.u3("_abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ", var0) >= 0 || d1.u3(".-0123456789", var0) >= 0 || var0 >= 128;
   }
}
