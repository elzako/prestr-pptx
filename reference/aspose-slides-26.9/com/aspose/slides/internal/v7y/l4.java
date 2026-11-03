package com.aspose.slides.internal.v7y;

import com.aspose.slides.exceptions.XPathException;

public final class l4 {
   private String n5;
   private int l6;
   private int k5;
   private char u3;
   private String a6;
   private String u9;
   private String h0;
   private double c8 = Double.NaN;
   private boolean t2;
   private com.aspose.slides.ms.System.Xml.u4 s7 = com.aspose.slides.ms.System.Xml.u4.n5().l6();

   public l4(String var1) {
      if (var1 == null) {
         throw XPathException.create("'{0}' is an invalid expression.", com.aspose.slides.ms.System.d1.n5);
      }

      this.n5 = var1;
      this.s7();
      this.c8();
   }

   public final String n5() {
      return this.n5;
   }

   private char t2() {
      return this.u3;
   }

   private boolean s7() {
      if (this.l6 < this.n5.length()) {
         this.u3 = this.n5.charAt(this.l6++);
         return true;
      } else {
         this.u3 = 0;
         return false;
      }
   }

   public final int l6() {
      return this.k5;
   }

   public final String k5() {
      return this.a6;
   }

   public final String u3() {
      return this.u9;
   }

   public final String a6() {
      return this.h0;
   }

   public final double u9() {
      return this.c8;
   }

   public final boolean h0() {
      return this.t2;
   }

   private void x8() {
      while (this.s7.n5(this.t2()) && this.s7()) {
      }
   }

   public final boolean c8() {
      this.x8();
      switch (this.t2()) {
         case '\u0000':
            this.k5 = 69;
            return false;
         case '!':
            this.k5 = 33;
            this.s7();
            if (this.t2() == '=') {
               this.k5 = 78;
               this.s7();
            }
            break;
         case '"':
         case '\'':
            this.k5 = 115;
            this.h0 = this.e2();
            break;
         case '#':
         case '$':
         case '(':
         case ')':
         case '*':
         case '+':
         case ',':
         case '-':
         case '=':
         case '@':
         case '[':
         case ']':
         case '|':
            this.k5 = com.aspose.slides.ms.System.z3.h0(this.t2(), com.aspose.slides.internal.x7n.l6.k5());
            this.s7();
            break;
         case '.':
            this.k5 = 46;
            this.s7();
            if (this.t2() == '.') {
               this.k5 = 68;
               this.s7();
            } else if (com.aspose.slides.ms.System.Xml.u4.t2(this.t2())) {
               this.k5 = 100;
               this.c8 = this.y4();
            }
            break;
         case '/':
            this.k5 = 47;
            this.s7();
            if (this.t2() == '/') {
               this.k5 = 83;
               this.s7();
            }
            break;
         case '<':
            this.k5 = 60;
            this.s7();
            if (this.t2() == '=') {
               this.k5 = 76;
               this.s7();
            }
            break;
         case '>':
            this.k5 = 62;
            this.s7();
            if (this.t2() == '=') {
               this.k5 = 71;
               this.s7();
            }
            break;
         default:
            if (com.aspose.slides.ms.System.Xml.u4.t2(this.t2())) {
               this.k5 = 100;
               this.c8 = this.n3();
            } else {
               if (!this.s7.k5(this.t2())) {
                  throw XPathException.create("'{0}' has an invalid token.", this.n5());
               }

               this.k5 = 110;
               this.a6 = this.t9();
               this.u9 = com.aspose.slides.ms.System.d1.n5;
               if (this.t2() == ':') {
                  this.s7();
                  if (this.t2() == ':') {
                     this.s7();
                     this.k5 = 97;
                  } else {
                     this.u9 = this.a6;
                     if (this.t2() == '*') {
                        this.s7();
                        this.a6 = "*";
                     } else {
                        if (!this.s7.k5(this.t2())) {
                           throw XPathException.create("'{0}' has an invalid qualified name.", this.n5());
                        }

                        this.a6 = this.t9();
                     }
                  }
               } else {
                  this.x8();
                  if (this.t2() == ':') {
                     this.s7();
                     if (this.t2() != ':') {
                        throw XPathException.create("'{0}' has an invalid qualified name.", this.n5());
                     }

                     this.s7();
                     this.k5 = 97;
                  }
               }

               this.x8();
               this.t2 = this.t2() == '(';
            }
      }

      return true;
   }

   private double n3() {
      int var1 = this.l6 - 1;

      int var2;
      for (var2 = 0; com.aspose.slides.ms.System.Xml.u4.t2(this.t2()); var2++) {
         this.s7();
      }

      if (this.t2() == '.') {
         this.s7();
         var2++;

         while (com.aspose.slides.ms.System.Xml.u4.t2(this.t2())) {
            this.s7();
            var2++;
         }
      }

      return com.aspose.slides.ms.System.Xml.f4.n5((Object)com.aspose.slides.ms.System.d1.l6(this.n5, var1, var2));
   }

   private double y4() {
      int var1 = this.l6 - 2;

      int var2;
      for (var2 = 1; com.aspose.slides.ms.System.Xml.u4.t2(this.t2()); var2++) {
         this.s7();
      }

      return com.aspose.slides.ms.System.Xml.f4.n5((Object)com.aspose.slides.ms.System.d1.l6(this.n5, var1, var2));
   }

   private String e2() {
      char var1 = this.t2();
      this.s7();
      int var2 = this.l6 - 1;

      int var3;
      for (var3 = 0; this.t2() != var1; var3++) {
         if (!this.s7()) {
            throw XPathException.create("This is an unclosed string.");
         }
      }

      this.s7();
      return com.aspose.slides.ms.System.d1.l6(this.n5, var2, var3);
   }

   private String t9() {
      int var1 = this.l6 - 1;

      int var2;
      for (var2 = 0; this.s7.l6(this.t2()); var2++) {
         this.s7();
      }

      return com.aspose.slides.ms.System.d1.l6(this.n5, var1, var2);
   }
}
