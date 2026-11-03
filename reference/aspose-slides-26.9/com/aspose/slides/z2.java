package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.ms.System.IDisposable;

class z2 {
   private static final String[] n5 = new String[]{"list-level-style-number", "list-level-style-bullet", "list-level-style-image"};

   public static void n5(IParagraphFormat var0, PortionCollection var1, com.aspose.slides.internal.k4y.a8r var2, int var3, h6j var4) {
      var0.setDepth((short)com.aspose.slides.internal.n8e.v4.n5(var3 - 1, 0, 8));
      l6(var0, var1, var2, var3, var4);
   }

   private static void l6(IParagraphFormat var0, PortionCollection var1, com.aspose.slides.internal.k4y.a8r var2, int var3, h6j var4) {
      com.aspose.slides.internal.k4y.g7 var5 = n5(var2, var3);
      if (var5 != null) {
         if ("list-level-style-number".equals(var5.n5())) {
            com.aspose.slides.internal.k4y.x8m var6 = (com.aspose.slides.internal.k4y.x8m)var5.l6();
            n5(var0, var6, var4);
            n5(var0, var1, var6.t2(), var4);
            n5(var0, var1, var6.c8(), var4);
         } else if ("list-level-style-bullet".equals(var5.n5())) {
            com.aspose.slides.internal.k4y.v8w var7 = (com.aspose.slides.internal.k4y.v8w)var5.l6();
            n5(var0, var7);
            n5(var0, var1, var7.u9(), var4);
            n5(var0, var1, var7.a6(), var4);
         } else {
            if (!"list-level-style-image".equals(var5.n5())) {
               throw new ArgumentOutOfRangeException();
            }

            com.aspose.slides.internal.k4y.b5c var8 = (com.aspose.slides.internal.k4y.b5c)var5.l6();
            n5(var0, var8, var4);
            n5(var0, var1, var8.u3(), var4);
         }
      }
   }

   private static void n5(IParagraphFormat var0, com.aspose.slides.internal.k4y.x8m var1, h6j var2) {
      BulletFormat var3 = (BulletFormat)var0.getBullet();
      if (!com.aspose.slides.ms.System.d1.n5(var1.u3())) {
         var3.setType((byte)2);
         String var4 = var1.a6();
         if (var4 == null) {
            var4 = "";
         }

         String var5 = var4;
         String var6 = var1.u3();
         if (var6 == null) {
            var6 = "";
         }

         String var7 = var6;
         String var8 = var1.u9();
         if (var8 == null) {
            var8 = "";
         }

         String var9 = var8;
         var3.setNumberedBulletStyle(n5(var5, var7, var9));
         if ((var1.h0() & 4294967295L) != 1L) {
            var3.setNumberedBulletStartWith((short)var1.h0());
         }
      }
   }

   private static void n5(IParagraphFormat var0, com.aspose.slides.internal.k4y.v8w var1) {
      BulletFormat var2 = (BulletFormat)var0.getBullet();
      var2.setType((byte)1);
      var2.setChar(var1.u3());
   }

   private static void n5(IParagraphFormat var0, com.aspose.slides.internal.k4y.b5c var1, h6j var2) {
      BulletFormat var3 = (BulletFormat)var0.getBullet();
      var3.setType((byte)3);
      IPPImage var4 = var2.n5().n5(var1.k5());
      var3.getPicture().setImage(var4);
   }

   private static void n5(IParagraphFormat var0, PortionCollection var1, com.aspose.slides.internal.k4y.j9d var2, h6j var3) {
      if (var2 != null) {
         IBulletFormat var4 = var0.getBullet();
         if (t2f.k5(var2.s7()) && t2f.l6(var2.s7())) {
            var4.setHeight(t2f.u3(var2.s7()));
         } else if (var1 != null && var1.getCount() > 0 && !t2f.l6(var2.s7())) {
            var4.setHeight(n5(var1, var2));
         }

         if (t2f.k5(var2.u9())) {
            String var5 = com.aspose.slides.ms.System.d1.n5(var2.u9(), "'", "");
            byte var6 = 1;
            if (t2f.k5(var2.t2()) && com.aspose.slides.ms.System.d1.a6("x-symbol", var2.t2())) {
               var6 = 2;
            }

            e4z var7 = var3.n5().n5().t9().n5(var5, var6, 0, 18.0F, 0, false);
            if (var7.u3() || var6 == 2 && !com.aspose.slides.ms.System.t9.x8(var4.getChar())) {
               var4.setFont(new FontData(var5, var6));
            } else {
               var4.setFont(new FontData(v6v.n5, v6v.n5.getFontName(), var6));
            }

            var4.setBulletHardFont((byte)1);
         }

         if (t2f.k5(var2.l6())) {
            ((ColorFormat)var4.getColor()).n5(t2f.x8(var2.l6()).o8());
            var4.setBulletHardColor((byte)1);
         }
      }
   }

   private static float n5(PortionCollection var0, com.aspose.slides.internal.k4y.j9d var1) {
      c9g var2 = ((Portion)var0.get_Item(0)).l6().r4();
      double var3 = t2f.u9(var1.s7());
      return com.aspose.slides.ms.System.d2.k5(var3) ? 100.0F : (float)(var3 * 100.0 / var2.getFontHeight());
   }

   private static void n5(IParagraphFormat var0, PortionCollection var1, com.aspose.slides.internal.k4y.j1w var2, h6j var3) {
      if (var0 == null) {
         throw new ArgumentNullException("paragraphFormat");
      }

      if (var2 != null) {
         if (t2f.k5(var2.n5()) && t2f.k5(var2.l6())) {
            float var8 = (float)t2f.u9(var2.l6());
            float var5 = (float)t2f.u9(var2.n5());
            var0.setIndent(var8 < 0.0F ? var8 : var8 * -1.0F);
            if (com.aspose.slides.ms.System.n1.k5(var0.getMarginLeft()) || var0.getMarginLeft() < var5) {
               var0.setMarginLeft(var5 - var0.getIndent());
            }
         } else {
            if (t2f.k5(var2.l6())) {
               var0.setIndent((float)t2f.u9(var2.l6()) * -1.0F);
               var0.setMarginLeft(var0.getIndent() * -1.0F);
            }

            if (t2f.k5(var2.n5())) {
               float var4 = (float)t2f.u9(var2.n5());
               if (com.aspose.slides.ms.System.n1.k5(var0.getMarginLeft()) || var0.getMarginLeft() < var4) {
                  var0.setMarginLeft(var4);
               }
            }
         }

         if (var0.getBullet().getType() == 3 && t2f.k5(var2.k5())) {
            int var9 = var0.getBullet().getPicture().getImage().getWidth();
            float var10 = (float)t2f.u9(var2.k5()) / var9;
            float var6 = var9 * (var10 < 1.0F ? 1.0F : var10);
            float var7 = Float.NaN;
            if (var1 != null && var1.getCount() > 0) {
               var7 = ((Portion)var1.get_Item(0)).l6().r4().getFontHeight();
            } else {
               var7 = var0.getDefaultPortionFormat().getFontHeight();
            }

            var0.getBullet()
               .setHeight(com.aspose.slides.ms.System.n1.k5(var7) ? 100.0F : (float)com.aspose.slides.ms.System.q1.l6((double)(var6 / var7 * 100.0F)));
         }
      }
   }

   private static byte n5(String... var0) {
      if (var0 != null && var0.length == 3) {
         byte var1 = -1;
         String var2 = var0[0];
         String var3 = var0[1];
         String var4 = var0[2];
         if ("(".equals(var2) && ")".equals(var4) && "a".equals(var3)) {
            var1 = 8;
         } else if ("".equals(var2) && ")".equals(var4) && "a".equals(var3)) {
            var1 = 9;
         } else if ("".equals(var2) && ".".equals(var4) && "a".equals(var3)) {
            var1 = 0;
         } else if ("(".equals(var2) && ")".equals(var4) && "A".equals(var3)) {
            var1 = 10;
         } else if ("".equals(var2) && ")".equals(var4) && "A".equals(var3)) {
            var1 = 11;
         } else if ("".equals(var2) && ".".equals(var4) && "A".equals(var3)) {
            var1 = 1;
         } else if ("".equals(var2) && ".".equals(var4) && "1".equals(var3)) {
            var1 = 3;
         } else if ("(".equals(var2) && ")".equals(var4) && "1".equals(var3)) {
            var1 = 12;
         } else if ("".equals(var2) && ")".equals(var4) && "1".equals(var3)) {
            var1 = 2;
         } else if ("".equals(var2) && "".equals(var4) && "1".equals(var3)) {
            var1 = 28;
         } else if ("(".equals(var2) && ")".equals(var4) && "i".equals(var3)) {
            var1 = 4;
         } else if ("".equals(var2) && ")".equals(var4) && "i".equals(var3)) {
            var1 = 5;
         } else if ("".equals(var2) && ".".equals(var4) && "i".equals(var3)) {
            var1 = 6;
         } else if ("(".equals(var2) && ")".equals(var4) && "I".equals(var3)) {
            var1 = 14;
         } else if ("".equals(var2) && ")".equals(var4) && "I".equals(var3)) {
            var1 = 15;
         } else if ("".equals(var2) && ".".equals(var4) && "I".equals(var3)) {
            var1 = 7;
         }

         return var1;
      } else {
         throw new ArgumentException("templateParams");
      }
   }

   public static com.aspose.slides.internal.k4y.g7 n5(com.aspose.slides.internal.k4y.a8r var0, int var1) {
      if (var0 == null) {
         return null;
      }

      List$Enumerator var2 = var0.l6().iterator();

      try {
         while (var2.hasNext()) {
            com.aspose.slides.internal.k4y.g7 var3 = (com.aspose.slides.internal.k4y.g7)var2.next();
            if ("list-level-style-number".equals(var3.n5())) {
               com.aspose.slides.internal.k4y.x8m var4 = (com.aspose.slides.internal.k4y.x8m)var3.l6();
               if ((var4.k5() & 4294967295L) == var1) {
                  return var3;
               }
            } else if ("list-level-style-bullet".equals(var3.n5())) {
               com.aspose.slides.internal.k4y.v8w var9 = (com.aspose.slides.internal.k4y.v8w)var3.l6();
               if ((var9.k5() & 4294967295L) == var1) {
                  return var3;
               }
            } else if ("list-level-style-image".equals(var3.n5())) {
               com.aspose.slides.internal.k4y.b5c var10 = (com.aspose.slides.internal.k4y.b5c)var3.l6();
               if ((var10.l6() & 4294967295L) == var1) {
                  return var3;
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      return null;
   }
}
