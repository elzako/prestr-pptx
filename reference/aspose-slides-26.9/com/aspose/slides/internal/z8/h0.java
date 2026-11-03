package com.aspose.slides.internal.z8;

public class h0 {
   public final com.aspose.slides.internal.k5.u9 n5(String var1) {
      com.aspose.slides.internal.e2.k5 var2 = new com.aspose.slides.internal.e2.k5(
         new com.aspose.slides.internal.n5.s7(new com.aspose.slides.internal.e2.l6(new com.aspose.slides.internal.n5.k5(var1)))
      );

      try {
         com.aspose.slides.internal.l6.u3 var3 = var2.t2();
         y4 var4 = this.n5(var3);
         switch (var4.n5()) {
            case 13:
               return new com.aspose.slides.internal.y4.c8(var4.a6(), (short)1);
            case 14:
               return new com.aspose.slides.internal.y4.c8(var4.u9(), (short)1);
            case 15:
               return new com.aspose.slides.internal.y4.c8(var4.u9(), (short)3);
            case 16:
               return new com.aspose.slides.internal.y4.c8(var4.u9(), (short)4);
            case 17:
               return new com.aspose.slides.internal.y4.c8(var4.u9(), (short)5);
            case 18:
               return new com.aspose.slides.internal.y4.c8(var4.u9(), (short)8);
            case 19:
               return new com.aspose.slides.internal.y4.c8(var4.u9(), (short)6);
            case 20:
               return new com.aspose.slides.internal.y4.c8(var4.u9(), (short)7);
            case 21:
               return new com.aspose.slides.internal.y4.c8(var4.u9(), (short)9);
            case 22:
               return new com.aspose.slides.internal.y4.c8(var4.u9(), (short)10);
            case 23:
               return new com.aspose.slides.internal.y4.c8(var4.u9(), (short)2);
            default:
               throw u9.n5(var4.n5());
         }
      } catch (com.aspose.slides.internal.n5.w1 var5) {
         throw new u3(var5.getMessage(), var5);
      }
   }

   private y4 n5(com.aspose.slides.internal.l6.n3 var1) {
      y4 var2 = null;
      switch (var1.s7()) {
         case 44:
            var2 = n5.l6(null, var1.x8());
            break;
         case 53:
            var2 = n5.n5(null, var1.x8());
            break;
         case 67:
         case 68:
         case 69:
            var2 = n5.k5(null, var1);
            break;
         default:
            if (var1.s7() == 0) {
               throw new m3(var1.x8());
            }

            throw u9.n5(var1.s7(), var1.x8());
      }

      return var2;
   }
}
