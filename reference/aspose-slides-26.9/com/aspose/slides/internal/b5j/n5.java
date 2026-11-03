package com.aspose.slides.internal.b5j;

import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.n1;

public class n5 {
   private String n5;
   private int l6 = 0;
   private int k5 = 1;
   private int u3 = 1;
   private int a6 = 0;
   private boolean u9 = true;

   public n5(String var1) {
      this.n5 = var1;
      if (d1.n5(this.n5)) {
         this.u9 = false;
      }

      if (com.aspose.slides.ms.System.t9.u9(var1.charAt(0))) {
         this.a6++;
      }
   }

   public final boolean n5() {
      return !this.u9;
   }

   private boolean n5(boolean var1) {
      this.u9 = var1;
      this.a6++;
      return var1;
   }

   public final boolean l6() {
      while (this.a6 < this.n5.length() && this.u9) {
         switch (this.k5) {
            case 1:
               if (n5(this.n5.charAt(this.a6))) {
                  this.u3 = 1;
                  this.a6++;
                  break;
               }

               if (this.n5.charAt(this.a6) == '0') {
                  this.u3 = 1;
                  this.l6 = this.a6 + 1;
                  this.n5(true);
                  return false;
               }

               if (this.n5.charAt(this.a6) == '1') {
                  this.u3 = 1;
                  this.l6 = this.a6 + 1;
                  this.n5(true);
                  return true;
               }

               this.n5(false);
               return false;
            default:
               this.n5(false);
               return false;
         }
      }

      this.n5(false);
      return false;
   }

   public final float k5() {
      while (this.a6 < this.n5.length() && this.u9) {
         label105:
         switch (this.k5) {
            case 1:
               if (com.aspose.slides.ms.System.t9.s7(this.n5.charAt(this.a6))) {
                  this.u3 = 3;
               } else if (n5(this.n5.charAt(this.a6))) {
                  this.u3 = 1;
               } else {
                  switch (this.n5.charAt(this.a6)) {
                     case '+':
                     case '-':
                        this.u3 = 2;
                        break label105;
                     case ',':
                     default:
                        this.u3 = 0;
                        break label105;
                     case '.':
                        this.u3 = 4;
                  }
               }
               break;
            case 2:
               if (com.aspose.slides.ms.System.t9.s7(this.n5.charAt(this.a6))) {
                  this.u3 = 3;
               } else if (this.n5.charAt(this.a6) == '.') {
                  this.u3 = 4;
               } else {
                  this.u3 = 0;
               }
               break;
            case 3:
               if (com.aspose.slides.ms.System.t9.s7(this.n5.charAt(this.a6))) {
                  this.u3 = 3;
               } else if (n5(this.n5.charAt(this.a6))) {
                  this.u3 = 1;
               } else {
                  switch (this.n5.charAt(this.a6)) {
                     case '+':
                     case '-':
                        this.u3 = 2;
                        break label105;
                     case '.':
                        this.u3 = 4;
                        break label105;
                     case 'E':
                     case 'e':
                        this.u3 = 6;
                        break label105;
                     default:
                        this.u3 = 0;
                  }
               }
               break;
            case 4:
               if (com.aspose.slides.ms.System.t9.s7(this.n5.charAt(this.a6))) {
                  this.u3 = 5;
               } else if (n5(this.n5.charAt(this.a6))) {
                  this.u3 = 1;
               } else {
                  switch (this.n5.charAt(this.a6)) {
                     case '+':
                     case '-':
                        this.u3 = 2;
                        break label105;
                     case 'E':
                     case 'e':
                        this.u3 = 6;
                        break label105;
                     default:
                        this.u3 = 0;
                  }
               }
               break;
            case 5:
               if (com.aspose.slides.ms.System.t9.s7(this.n5.charAt(this.a6))) {
                  this.u3 = 5;
               } else if (n5(this.n5.charAt(this.a6))) {
                  this.u3 = 1;
               } else {
                  switch (this.n5.charAt(this.a6)) {
                     case '+':
                     case '-':
                        this.u3 = 2;
                        break label105;
                     case '.':
                        this.u3 = 4;
                        break label105;
                     case 'E':
                     case 'e':
                        this.u3 = 6;
                        break label105;
                     default:
                        this.u3 = 0;
                  }
               }
               break;
            case 6:
               if (com.aspose.slides.ms.System.t9.s7(this.n5.charAt(this.a6))) {
                  this.u3 = 8;
               } else if (n5(this.n5.charAt(this.a6))) {
                  this.u3 = 0;
               } else {
                  switch (this.n5.charAt(this.a6)) {
                     case '+':
                     case '-':
                        this.u3 = 7;
                        break label105;
                     default:
                        this.u3 = 0;
                  }
               }
               break;
            case 7:
               if (com.aspose.slides.ms.System.t9.s7(this.n5.charAt(this.a6))) {
                  this.u3 = 8;
               } else {
                  this.u3 = 0;
               }
               break;
            case 8:
               if (com.aspose.slides.ms.System.t9.s7(this.n5.charAt(this.a6))) {
                  this.u3 = 8;
               } else if (n5(this.n5.charAt(this.a6))) {
                  this.u3 = 1;
               } else {
                  switch (this.n5.charAt(this.a6)) {
                     case '+':
                     case '-':
                        this.u3 = 2;
                        break;
                     case ',':
                     default:
                        this.u3 = 0;
                        break;
                     case '.':
                        this.u3 = 4;
                  }
               }
         }

         if (this.u3 < this.k5) {
            float var1 = n1.n5(d1.l6(this.n5, this.l6, this.a6 - this.l6), 167, com.aspose.slides.internal.x7n.l6.k5());
            this.l6 = this.a6;
            this.k5 = this.u3;
            this.n5(true);
            return var1;
         }

         if (this.u3 != this.k5 && this.k5 == 1) {
            this.l6 = this.a6;
         }

         if (this.u3 == 0) {
            this.n5(false);
            return -Float.MAX_VALUE;
         }

         this.k5 = this.u3;
         this.a6++;
      }

      if (this.k5 != 1 && this.u9 && this.l6 < this.n5.length()) {
         float var2 = n1.n5(d1.l6(this.n5, this.l6, this.n5.length() - this.l6), 167, com.aspose.slides.internal.x7n.l6.k5());
         this.l6 = this.n5.length();
         this.n5(true);
         return var2;
      } else {
         this.n5(false);
         return -Float.MAX_VALUE;
      }
   }

   private static boolean n5(char var0) {
      switch (var0) {
         case '\t':
         case '\n':
         case '\r':
         case ' ':
         case ',':
            return true;
         default:
            return false;
      }
   }
}
