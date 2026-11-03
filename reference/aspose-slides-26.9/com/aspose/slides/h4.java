package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;

class h4 {
   public static final Dictionary<Integer, float[]> n5 = new Dictionary<>();

   public static float[] n5(int var0, float[] var1, float var2) {
      return n5(var0, var1, var2, true);
   }

   public static float[] n5(int var0, float[] var1, float var2, boolean var3) {
      float[] var4 = null;
      float[][] var5 = new float[][]{var4};
      boolean var6 = !n5.tryGetValue(var0, var5);
      var4 = var5[0];
      if (var6) {
         return null;
      }

      var4 = com.aspose.slides.internal.v6g.k5.k5(com.aspose.slides.ms.System.u3.n5((Object)(var4)).deepClone(), float[].class);
      if (var1 != null) {
         var4[0] = var1[0];
         var4[1] = var1[1];
         var4[2] = var1[2];
      }

      if (var4[3] != 0.0F && !com.aspose.slides.ms.System.n1.k5(var2)) {
         var4[3] = var2;
      }

      if (var0 >= 29 && var0 <= 37) {
         var4[5] *= (float)com.aspose.slides.ms.System.q1.t2(com.aspose.slides.internal.s6.w2.n5(var4[3] / 2.0F));
      }

      return var3
            && com.aspose.slides.ms.System.q1.n5(var4[0]) < Float.MIN_VALUE
            && com.aspose.slides.ms.System.q1.n5(var4[1]) < Float.MIN_VALUE
            && com.aspose.slides.ms.System.q1.n5(var4[2]) < Float.MIN_VALUE
            && com.aspose.slides.ms.System.q1.n5(var4[3]) < Float.MIN_VALUE
            && com.aspose.slides.ms.System.q1.n5(var4[5]) < Float.MIN_VALUE
         ? null
         : var4;
   }

   public static g0 n5(IThreeDFormat var0) {
      if (var0.getCamera().getCameraType() != -1) {
         g0 var3 = new g0();
         var3.n5(var0.getCamera().getRotation());
         var3.n5(var0.getCamera().getFieldOfViewAngle());
         var3.n5(var0.getCamera().getCameraType());
         return var3;
      } else {
         IThreeDFormatEffectiveData var1 = var0.getEffective();
         if (var1.getCamera().getCameraType() != -1) {
            g0 var2 = new g0();
            var2.n5(var1.getCamera().getRotation());
            var2.n5(var1.getCamera().getFieldOfViewAngle());
            var2.n5(var1.getCamera().getCameraType());
            return var2;
         } else {
            return null;
         }
      }
   }

   public static g0 n5(GeometryShape var0) {
      if (var0.isGrouped() && var0.getParentGroup() != null) {
         if (com.aspose.slides.internal.v6g.k5.l6(var0, SmartArtShape.class)) {
            SmartArtShape var1 = com.aspose.slides.internal.v6g.k5.n5(var0, SmartArtShape.class);
            SmartArt var2 = var1.y4().h0().z1().l6();
            if (var2.getThreeDFormat().getCamera().getCameraType() == -1) {
               com.aspose.slides.internal.k4y.h6l var3 = var2.u9().a6().k5();
               if (var3.l6().l6() != -1 && var3.l6().l6() != var1.getThreeDFormat().getCamera().getCameraType()) {
                  g0 var4 = new g0();
                  var4.n5(var3.l6().k5());
                  var4.n5(var3.l6().l6());
                  if (var3.l6().a6() == null) {
                     Object var5 = null;
                     float[][] var6 = new float[][]{(float[])var5};
                     boolean var7 = !n5.tryGetValue(var3.l6().l6(), var6);
                     var5 = var6[0];
                     if (var7) {
                        return null;
                     }

                     var4.n5(new float[3]);
                     com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5((Object)(var5)), com.aspose.slides.ms.System.u3.n5((Object)(var4.n5())), 3);
                  } else {
                     var4.n5(new float[]{var3.l6().a6().n5(), var3.l6().a6().l6(), var3.l6().a6().k5()});
                  }

                  return var4;
               }
            }

            if (var1.getThreeDFormat().getCamera().getCameraType() != -1) {
               return n5(var1.getThreeDFormat());
            }

            if (var2.getThreeDFormat().getCamera().getCameraType() != -1) {
               return n5(var2.getThreeDFormat());
            }
         }

         if (var0.r4().u9() == -1) {
            for (IGroupShape var8 = var0.getParentGroup(); var8 != null; var8 = var8.getParentGroup()) {
               if (var8.getThreeDFormat().getCamera().getCameraType() != -1) {
                  return n5(var8.getThreeDFormat());
               }
            }
         }
      }

      return n5(var0.r4());
   }

   public static g0 n5(TextFrame var0) {
      return n5(var0.s7().getThreeDFormat());
   }

   static {
      n5.addItem(0, new float[]{35.4F, 314.7F, 299.8F, 0.0F, 0.0F, 0.0F});
      n5.addItem(1, new float[]{35.4F, 45.3F, 60.2F, 0.0F, 0.0F, 0.0F});
      n5.addItem(2, new float[]{35.0F, 45.0F, 0.0F, 0.0F, 0.0F, 0.0F});
      n5.addItem(3, new float[]{35.0F, 45.0F, 0.0F, 0.0F, 0.0F, 0.0F});
      n5.addItem(4, new float[]{18.0F, 64.0F, 0.0F, 0.0F, 0.0F, 0.0F});
      n5.addItem(5, new float[]{18.0F, 334.0F, 0.0F, 0.0F, 0.0F, 0.0F});
      n5.addItem(6, new float[]{301.3F, 306.5F, 57.6F, 0.0F, 0.0F, 0.0F});
      n5.addItem(7, new float[]{18.0F, 26.0F, 0.0F, 0.0F, 0.0F, 0.0F});
      n5.addItem(8, new float[]{18.0F, 296.0F, 0.0F, 0.0F, 0.0F, 0.0F});
      n5.addItem(9, new float[]{301.3F, 53.5F, 302.4F, 0.0F, 0.0F, 0.0F});
      n5.addItem(10, new float[]{58.7F, 306.5F, 302.4F, 0.0F, 0.0F, 0.0F});
      n5.addItem(11, new float[]{342.0F, 64.0F, 0.0F, 0.0F, 0.0F, 0.0F});
      n5.addItem(12, new float[]{342.0F, 334.0F, 0.0F, 0.0F, 0.0F, 0.0F});
      n5.addItem(13, new float[]{58.7F, 53.5F, 57.6F, 0.0F, 0.0F, 0.0F});
      n5.addItem(14, new float[]{342.0F, 26.0F, 0.0F, 0.0F, 0.0F, 0.0F});
      n5.addItem(15, new float[]{325.0F, 315.0F, 0.0F, 0.0F, 0.0F, 0.0F});
      n5.addItem(17, new float[]{35.0F, 315.0F, 0.0F, 0.0F, 0.0F, 0.0F});
      n5.addItem(18, new float[]{324.6F, 45.3F, 299.8F, 0.0F, 0.0F, 0.0F});
      n5.addItem(19, new float[]{324.6F, 314.7F, 60.2F, 0.0F, 0.0F, 0.0F});
      n5.addItem(20, new float[]{0.0F, 0.0F, 0.0F, 0.0F, 90.0F, 0.5F});
      n5.addItem(21, new float[]{0.0F, 0.0F, 0.0F, 0.0F, 45.0F, 0.5F});
      n5.addItem(22, new float[]{0.0F, 0.0F, 0.0F, 0.0F, 135.0F, 0.5F});
      n5.addItem(23, new float[]{0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F});
      n5.addItem(24, new float[]{0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F});
      n5.addItem(25, new float[]{0.0F, 0.0F, 0.0F, 0.0F, 180.0F, 0.5F});
      n5.addItem(26, new float[]{0.0F, 0.0F, 0.0F, 0.0F, 270.0F, 0.5F});
      n5.addItem(27, new float[]{0.0F, 0.0F, 0.0F, 0.0F, 315.0F, 0.5F});
      n5.addItem(28, new float[]{0.0F, 0.0F, 0.0F, 0.0F, 225.0F, 0.5F});
      n5.addItem(29, new float[]{0.0F, 0.0F, 0.0F, 65.0F, 90.0F, 0.3F});
      n5.addItem(30, new float[]{0.0F, 0.0F, 0.0F, 65.0F, 45.0F, 0.45F});
      n5.addItem(31, new float[]{0.0F, 0.0F, 0.0F, 65.0F, 135.0F, 0.45F});
      n5.addItem(32, new float[]{0.0F, 0.0F, 0.0F, 65.0F, 0.0F, 0.0F});
      n5.addItem(33, new float[]{0.0F, 0.0F, 0.0F, 65.0F, 0.0F, 0.3F});
      n5.addItem(34, new float[]{0.0F, 0.0F, 0.0F, 65.0F, 180.0F, 0.45F});
      n5.addItem(35, new float[]{0.0F, 0.0F, 0.0F, 65.0F, 270.0F, 0.3F});
      n5.addItem(36, new float[]{0.0F, 0.0F, 0.0F, 65.0F, 315.0F, 0.45F});
      n5.addItem(37, new float[]{0.0F, 0.0F, 0.0F, 65.0F, 225.0F, 0.45F});
      n5.addItem(38, new float[]{0.0F, 0.0F, 0.0F, 0.0F, 90.0F, 0.3F});
      n5.addItem(39, new float[]{0.0F, 0.0F, 0.0F, 0.0F, 45.0F, 0.3F});
      n5.addItem(40, new float[]{0.0F, 0.0F, 0.0F, 0.0F, 135.0F, 0.3F});
      n5.addItem(41, new float[]{0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.3F});
      n5.addItem(42, new float[]{0.0F, 0.0F, 0.0F, 0.0F, 180.0F, 0.3F});
      n5.addItem(43, new float[]{0.0F, 0.0F, 0.0F, 0.0F, 270.0F, 0.3F});
      n5.addItem(44, new float[]{0.0F, 0.0F, 0.0F, 0.0F, 315.0F, 0.3F});
      n5.addItem(45, new float[]{0.0F, 0.0F, 0.0F, 0.0F, 225.0F, 0.3F});
      n5.addItem(46, new float[]{0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F});
      n5.addItem(47, new float[]{340.0F, 0.0F, 0.0F, 45.0F, 0.0F, 0.0F});
      n5.addItem(48, new float[]{39.3F, 14.3F, 341.1F, 45.0F, 0.0F, 0.0F});
      n5.addItem(49, new float[]{39.3F, 345.7F, 18.9F, 45.0F, 0.0F, 0.0F});
      n5.addItem(50, new float[]{20.0F, 0.0F, 0.0F, 45.0F, 0.0F, 0.0F});
      n5.addItem(51, new float[]{10.4F, 43.9F, 356.4F, 45.0F, 0.0F, 0.0F});
      n5.addItem(52, new float[]{10.4F, 316.1F, 3.6F, 45.0F, 0.0F, 0.0F});
      n5.addItem(53, new float[]{0.0F, 0.0F, 0.0F, 45.0F, 0.0F, 0.0F});
      n5.addItem(54, new float[]{8.1F, 34.5F, 357.1F, 45.0F, 0.0F, 0.0F});
      n5.addItem(55, new float[]{8.1F, 325.5F, 2.9F, 45.0F, 0.0F, 0.0F});
      n5.addItem(56, new float[]{349.0F, 14.3F, 2.6F, 45.0F, 0.0F, 0.0F});
      n5.addItem(57, new float[]{349.0F, 345.7F, 357.4F, 45.0F, 0.0F, 0.0F});
      n5.addItem(58, new float[]{0.0F, 20.0F, 0.0F, 45.0F, 0.0F, 0.0F});
      n5.addItem(59, new float[]{309.6F, 0.0F, 0.0F, 45.0F, 0.0F, 0.0F});
      n5.addItem(60, new float[]{324.8F, 0.0F, 0.0F, 45.0F, 0.0F, 0.0F});
      n5.addItem(61, new float[]{0.0F, 340.0F, 0.0F, 45.0F, 0.0F, 0.0F});
   }
}
