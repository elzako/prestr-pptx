package com.aspose.slides.internal.z8;

import com.aspose.slides.ms.System.d1;

class k7 {
   public final com.aspose.slides.internal.c8.l6 n5(com.aspose.slides.internal.l6.n3 var1) {
      if (var1.s7() == 27) {
         return this.l6(var1);
      } else if (var1.s7() == 28) {
         return this.l6(var1);
      } else {
         throw new u3(d1.n5("Token type '{0}' is not valid.", new Object[]{var1.s7()}));
      }
   }

   public final com.aspose.slides.internal.c8.k5 l6(com.aspose.slides.internal.l6.n3 var1) {
      int var2 = 0;
      com.aspose.slides.internal.c8.k5 var3 = null;

      while (var2 < var1.n5()) {
         com.aspose.slides.internal.l6.n3 var4 = var1.n5(var2);
         if (var4.s7() == 44) {
            if (var3 == null) {
               var3 = new com.aspose.slides.internal.c8.a6(var4.x8());
            } else {
               var3 = var3.n5(new com.aspose.slides.internal.c8.a6(var4.x8()));
            }
         } else if (var4.s7() == 55) {
            var4 = var1.n5(++var2);
            if (var3 == null) {
               var3 = this.k5(var4);
               if (var3 == null) {
                  throw new u3(d1.n5("Invalid media query '{0}' is not valid.", new Object[]{var4.h0()}));
               }
            } else {
               com.aspose.slides.internal.c8.k5 var5 = this.k5(var4);
               if (var5 == null) {
                  throw new u3(d1.n5("Invalid media query '{0}' is not valid.", new Object[]{var4.h0()}));
               }

               var3 = var3.n5(var5);
            }
         } else if (var4.s7() == 28) {
            if (var3 == null) {
               var3 = this.k5(var4);
            } else {
               var3 = var3.n5(this.k5(var4));
            }
         } else if (var4.s7() == 56) {
         }

         var2++;
      }

      return var3;
   }

   private com.aspose.slides.internal.c8.k5 k5(com.aspose.slides.internal.l6.n3 var1) {
      if (var1.n5() == 1) {
         return com.aspose.slides.internal.c8.u3.n5(var1.n5(0).x8());
      } else if (var1.n5() == 2) {
         com.aspose.slides.internal.l6.n3 var5 = var1.n5(1);
         com.aspose.slides.internal.k5.u9 var8 = this.u3(var5);
         return com.aspose.slides.internal.c8.u3.n5(var1.n5(0).x8(), var8);
      } else if (var1.n5() == 4) {
         com.aspose.slides.internal.k5.h0 var2 = new com.aspose.slides.internal.k5.h0();
         com.aspose.slides.internal.l6.n3 var3 = var1.n5(1);
         com.aspose.slides.internal.k5.u9 var4 = this.u3(var3);
         var2.l6(var4);
         var3 = var1.n5(2);
         var4 = this.u3(var3);
         var2.l6(var4);
         var3 = var1.n5(3);
         var4 = this.u3(var3);
         var2.l6(var4);
         return com.aspose.slides.internal.c8.u3.n5(var1.n5(0).x8(), var2);
      } else {
         throw new u3(d1.n5("Token '{0}' is not valid.", new Object[]{var1.n5(2).x8()}));
      }
   }

   private com.aspose.slides.internal.k5.u9 u3(com.aspose.slides.internal.l6.n3 var1) {
      y4 var2 = null;
      switch (var1.s7()) {
         case 44:
            var2 = n5.l6(null, var1.x8());
            break;
         case 53:
            var2 = n5.n5(null, var1.x8());
            break;
         case 61:
            var2 = n5.n5(null, (short)4, var1.x8());
            break;
         case 67:
         case 69:
            var2 = n5.k5(null, var1);
      }

      com.aspose.slides.internal.k5.u9 var3 = null;
      if (var2 != null) {
         switch (var2.n5()) {
            case 4:
               var3 = new com.aspose.slides.internal.y4.u9(var2);
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 24:
            case 25:
            case 26:
            case 27:
            case 31:
            case 32:
            case 33:
            case 34:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            default:
               break;
            case 13:
               var3 = new com.aspose.slides.internal.y4.c8(var2.a6(), (short)1);
               break;
            case 14:
               var3 = new com.aspose.slides.internal.y4.c8(var2.u9(), (short)1);
               break;
            case 15:
               var3 = new com.aspose.slides.internal.y4.c8(var2.u9(), (short)3);
               break;
            case 16:
               var3 = new com.aspose.slides.internal.y4.c8(var2.u9(), (short)4);
               break;
            case 17:
               var3 = new com.aspose.slides.internal.y4.c8(var2.u9(), (short)5);
               break;
            case 18:
               var3 = new com.aspose.slides.internal.y4.c8(var2.u9(), (short)8);
               break;
            case 19:
               var3 = new com.aspose.slides.internal.y4.c8(var2.u9(), (short)6);
               break;
            case 20:
               var3 = new com.aspose.slides.internal.y4.c8(var2.u9(), (short)7);
               break;
            case 21:
               var3 = new com.aspose.slides.internal.y4.c8(var2.u9(), (short)9);
               break;
            case 22:
               var3 = new com.aspose.slides.internal.y4.c8(var2.u9(), (short)10);
               break;
            case 23:
               var3 = new com.aspose.slides.internal.y4.c8(var2.u9(), (short)2);
               break;
            case 28:
               var3 = new com.aspose.slides.internal.y4.c8(var2.u9(), (short)11);
               break;
            case 29:
               var3 = new com.aspose.slides.internal.y4.c8(var2.u9(), (short)13);
               break;
            case 30:
               var3 = new com.aspose.slides.internal.y4.c8(var2.u9(), (short)12);
               break;
            case 35:
               var3 = com.aspose.slides.internal.y4.t9.k5(var2.t2());
               break;
            case 36:
               var3 = com.aspose.slides.internal.y4.t9.l6(var2.t2());
               break;
            case 44:
               var3 = new com.aspose.slides.internal.y4.h0(var2.u9(), "dpi");
               break;
            case 45:
               var3 = new com.aspose.slides.internal.y4.h0(var2.u9(), "dpcm");
               break;
            case 46:
               var3 = new com.aspose.slides.internal.y4.h0(var2.u9(), "dppx");
         }
      }

      return var3;
   }
}
