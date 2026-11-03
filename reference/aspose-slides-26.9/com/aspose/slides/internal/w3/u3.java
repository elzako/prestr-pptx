package com.aspose.slides.internal.w3;

import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.o9b.z1;
import com.aspose.slides.internal.r7c.c8;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.q1;

public class u3 {
   public static final float[] n5 = new float[]{16.0F, 19.5F, 22.5F, 27.5F, 33.5F, 39.5F, 48.0F, 56.5F, 68.5F, 83.0F};
   private static final float l6 = z1.n5(new com.aspose.slides.internal.o9b.l6(1, 1)).s7();
   private static final com.aspose.slides.internal.v6g.u9 k5 = new com.aspose.slides.internal.v6g.u9("px", "pt", "em", "%", "ex", "in", "cm", "mm", "pc");

   public static boolean n5(String var0, float[] var1, float var2, com.aspose.slides.internal.w5.k5 var3) {
      com.aspose.slides.internal.w3.n5.n5((Object)var0, "value");
      String var4 = var0;
      if ("larger".equals(var0)) {
         var4 = var3.a3().r4().l6().toString();
      }

      if (c8.u3(var4, "([-+]?\\d*\\.?\\d+)(pt|px|em|ex|in|cm|mm|pc|%)?")) {
         com.aspose.slides.internal.r7c.u3 var5 = c8.n5(var4, "([-+]?\\d*\\.?\\d+)(pt|px|em|ex|in|cm|mm|pc|%)?");
         String var6 = var5.a6().n5(1).k5();
         Object var7 = h0.n5(var6);
         if (var7 == null) {
            return false;
         }

         var1[0] = com.aspose.slides.internal.v6g.k5.u3(var7, float.class);
         String var8 = d1.n5(var5.a6().n5(2).k5(), com.aspose.slides.internal.x7n.l6.k5());
         switch (k5.n5(var8)) {
            case 0:
               var1[0] = l6(var1[0]);
            case 1:
            default:
               break;
            case 2:
               float var9 = var2;
               if (var3.p3() != null && var3.p3().n3() == 1) {
                  var9 = new com.aspose.slides.internal.u4.n5(var3.p3()).l6();
               }

               var1[0] = l6(var1[0], var9);
               break;
            case 3:
               var1[0] = n5(var1[0], var2);
         }

         return true;
      } else {
         return false;
      }
   }

   public static boolean n5(String var0, float[] var1) {
      if (d1.n5(var0)) {
         var1[0] = 0.0F;
         return false;
      }

      if (c8.u3(var0, "([-+]?\\d*\\.?\\d+)(pt|px|em|ex|in|cm|mm|pc|%)?")) {
         com.aspose.slides.internal.r7c.u3 var2 = c8.n5(var0, "([-+]?\\d*\\.?\\d+)(pt|px|em|ex|in|cm|mm|pc|%)?");
         String var3 = var2.a6().n5(1).k5();
         Object var4 = h0.n5(var3);
         if (var4 == null) {
            return false;
         }

         var1[0] = com.aspose.slides.internal.v6g.k5.u3(var4, float.class);
         String var5 = d1.n5(var2.a6().n5(2).k5(), com.aspose.slides.internal.x7n.l6.k5());
         switch (k5.n5(var5)) {
            case 0:
               var1[0] = l6(var1[0]);
            case 1:
            default:
               break;
            case 2:
               var1[0] = l6(var1[0], 0.0F);
               break;
            case 3:
               var1[0] = n5(var1[0]);
         }

         return true;
      } else {
         return false;
      }
   }

   public static float n5(float var0) {
      return (float)q1.n5((double)(var0 / 100.0F * 12.0F), (short)((short)1));
   }

   public static float n5(float var0, float var1) {
      return var1 * (var0 / 100.0F);
   }

   public static float l6(float var0, float var1) {
      return var0 * var1;
   }

   public static float l6(float var0) {
      return var0 * 0.75F;
   }

   public static IGenericList<com.aspose.slides.internal.w5.h0> n5(String var0) {
      List var1 = new List();
      if (d1.n5(var0)) {
         var1.addItem(new com.aspose.slides.internal.w5.h0(true));
         return var1;
      }

      com.aspose.slides.internal.r7c.u9 var2 = c8.l6(var0, "([-+]?\\d*\\.?\\d+)(pt|px|em|ex|in|cm|mm|pc|%)?");

      for (int var3 = 0; var3 < var2.n5(); var3++) {
         com.aspose.slides.internal.r7c.u3 var4 = var2.n5(var3);
         if (var4.u3()) {
            new com.aspose.slides.internal.w5.h0(0.0F, 0, true, false);
            String var6 = var4.a6().n5(1).k5();
            Object var7 = h0.n5(var6);
            if (var7 == null) {
               var1.addItem(new com.aspose.slides.internal.w5.h0(true));
            } else {
               float var8 = com.aspose.slides.internal.v6g.k5.u3(var7, float.class);
               String var9 = d1.n5(var4.a6().n5(2).k5(), com.aspose.slides.internal.x7n.l6.k5());
               com.aspose.slides.internal.w5.h0 var5;
               switch (k5.n5(var9)) {
                  case 0:
                     var5 = new com.aspose.slides.internal.w5.h0(var8, 4);
                     break;
                  case 1:
                     var5 = new com.aspose.slides.internal.w5.h0(var8, 0);
                     break;
                  case 2:
                     var5 = new com.aspose.slides.internal.w5.h0(var8, 1);
                     break;
                  case 3:
                     var5 = new com.aspose.slides.internal.w5.h0(var8, 3);
                     break;
                  case 4:
                     var5 = new com.aspose.slides.internal.w5.h0(var8, 2);
                     break;
                  case 5:
                     var5 = new com.aspose.slides.internal.w5.h0(var8, 5);
                     break;
                  case 6:
                     var5 = new com.aspose.slides.internal.w5.h0(var8, 6);
                     break;
                  case 7:
                     var5 = new com.aspose.slides.internal.w5.h0(var8, 7);
                     break;
                  case 8:
                     var5 = new com.aspose.slides.internal.w5.h0(var8, 4);
                     break;
                  default:
                     var5 = new com.aspose.slides.internal.w5.h0(var8, 0);
               }

               var1.addItem(var5);
            }
         }
      }

      return var1;
   }

   public static com.aspose.slides.internal.w5.h0 l6(String var0) {
      if (d1.n5(var0)) {
         return new com.aspose.slides.internal.w5.h0(true);
      } else if (d1.u3(var0, "auto", (short)5)) {
         return new com.aspose.slides.internal.w5.h0(true);
      } else if (d1.u3(var0, "inherit", (short)5)) {
         com.aspose.slides.internal.w5.h0 var2 = new com.aspose.slides.internal.w5.h0(0.0F);
         var2.n5(true);
         return var2;
      } else {
         IGenericList var1 = n5(var0);
         return var1.size() == 0 ? new com.aspose.slides.internal.w5.h0(true) : (com.aspose.slides.internal.w5.h0)var1.get_Item(0);
      }
   }

   public static float n5(com.aspose.slides.internal.w5.h0 var0, float var1) {
      if (var0.k5()) {
         return var1;
      }

      switch (var0.l6()) {
         case 0:
            return var0.n5();
         case 1:
            return var0.n5() * var1;
         case 2:
            return var0.n5() * var1 / 2.0F;
         case 3:
            return var1 * (var0.n5() / 100.0F);
         case 4:
            return var0.n5() * 72.0F / l6;
         case 5:
            return var0.n5() * 72.0F;
         case 6:
            return (float)(var0.n5() * 28.3464567);
         case 7:
            return (float)(var0.n5() * 2.83464567);
         case 8:
            return var0.n5() * 12.0F;
         default:
            return var0.n5();
      }
   }

   public static float n5(com.aspose.slides.internal.w5.h0 var0) {
      return n5(var0, 12.0F);
   }

   public static float k5(float var0) {
      return var0 / (72.0F / l6);
   }
}
