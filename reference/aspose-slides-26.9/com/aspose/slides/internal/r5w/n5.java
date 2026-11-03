package com.aspose.slides.internal.r5w;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericDictionary;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.o9b.p8;
import com.aspose.slides.internal.o9b.w1;
import com.aspose.slides.internal.o9b.y1;
import com.aspose.slides.internal.o9b.z1;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.Toolkit;
import java.awt.geom.AffineTransform;
import java.awt.geom.PathIterator;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Point2D.Double;
import java.lang.reflect.Field;

public class n5 {
   private static int n5;
   private static float l6 = 0.0F;
   private static float k5 = 0.0F;
   private static int u3 = 0;
   private static p8 a6 = null;

   public static boolean n5(int var0) {
      return var0 == 1 || var0 == 2 || var0 == 0;
   }

   public static int n5() {
      if (u3 == 0) {
         u3 = k5() ? 96 : Toolkit.getDefaultToolkit().getScreenResolution();
      }

      return u3;
   }

   public static p8 l6() {
      if (a6 == null) {
         if (k5()) {
            a6 = new p8(800, 600);
         } else {
            Dimension var0 = Toolkit.getDefaultToolkit().getScreenSize();
            a6 = new p8(var0.width, var0.height);
         }
      }

      return a6;
   }

   public static boolean k5() {
      if (n5 == 0) {
         boolean var0 = GraphicsEnvironment.isHeadless();
         if (!var0) {
            try {
               Toolkit.getDefaultToolkit();
            } catch (Exception var2) {
               var0 = true;
            }
         }

         n5 = var0 ? 2 : 1;
      }

      return n5 > 1;
   }

   public static double n5(int var0, int var1, double var2, float var4, float var5) {
      if (n5(var0) && n5(var1) && var4 == var5) {
         return var2;
      }

      double var6;
      switch (var0) {
         case 0:
         case 2:
            var6 = var2 / var4;
            break;
         case 1:
            var6 = var2 / var4;
            break;
         case 3:
            var6 = var2 / 72.0;
            break;
         case 4:
            var6 = var2;
            break;
         case 5:
            var6 = var2 / 300.0;
            break;
         case 6:
            var6 = var2 / 25.4F;
            break;
         default:
            throw new ArgumentException("Invalid GraphicsUnit");
      }

      double var8;
      switch (var1) {
         case 0:
         case 2:
            var8 = var6 * var5;
            break;
         case 1:
            var8 = var6 * var5;
            break;
         case 3:
            var8 = var6 * 72.0;
            break;
         case 4:
            var8 = var6;
            break;
         case 5:
            var8 = var6 * 300.0;
            break;
         case 6:
            var8 = var6 * 25.4F;
            break;
         default:
            throw new ArgumentException("Invalid GraphicsUnit");
      }

      return var8;
   }

   public static double n5(int var0, int var1, double var2) {
      return n5(var0, var1, var2, a6(), a6());
   }

   public static y1 n5(int var0, int var1, y1 var2) {
      return new y1(
         (float)n5(var0, var1, (double)var2.x8()),
         (float)n5(var0, var1, (double)var2.n3()),
         (float)n5(var0, var1, (double)var2.s7()),
         (float)n5(var0, var1, (double)var2.k5())
      );
   }

   public static float n5(int var0, int var1, float var2) {
      double var3 = 1.0;
      if (var0 == var1 && var2 != a6() && var1 != 2) {
         var3 = var2 / a6();
      } else if (var0 != var1 && (var0 != 1 || var1 != 2) && (var1 != 1 || var0 != 2)) {
         var3 = n5(var0, 4, var3) * var2;
      }

      return (float)var3;
   }

   public static float u3() {
      if (l6 == 0.0F) {
         com.aspose.slides.internal.o9b.l6 var0 = new com.aspose.slides.internal.o9b.l6(1, 1);
         z1 var1 = z1.n5(var0);
         l6 = var1.s7();
         k5 = var1.x8();
      }

      return l6;
   }

   public static float a6() {
      if (k5 == 0.0F) {
         com.aspose.slides.internal.o9b.l6 var0 = new com.aspose.slides.internal.o9b.l6(1, 1);
         z1 var1 = z1.n5(var0);
         l6 = var1.s7();
         k5 = var1.x8();
      }

      return k5;
   }

   public static AffineTransform n5(AffineTransform var0, int var1, float var2) {
      AffineTransform var3 = null;
      if (var1 != 1) {
         double var4 = n5(var1, 2, (double)var2);
         if (Math.abs(var4 - 1.0) > Float.MIN_VALUE) {
            var3 = AffineTransform.getScaleInstance(var4, var4);
         }
      }

      if (var3 != null) {
         var3.concatenate(var0);
      } else {
         var3 = var0;
      }

      return var3;
   }

   public static int n5(byte var0, double var1) {
      return (int)(Math.round(255.0 * Math.pow((var0 & 0xFF) / 255.0, var1)) & 255L);
   }

   public static int l6(int var0) {
      return n5(var0, -1.0);
   }

   public static int n5(int var0, double var1) {
      if (var1 == -1.0) {
         var1 = 2.2;
      }

      int var3 = n5((byte)(var0 >> 24 & 0xFF), var1);
      int var4 = n5((byte)(var0 >> 16 & 0xFF), var1);
      int var5 = n5((byte)(var0 >> 8 & 0xFF), var1);
      int var6 = n5((byte)(var0 >> 0 & 0xFF), var1);
      return var6 | var5 << 8 | var4 << 16 | var3 << 24;
   }

   public static AffineTransform n5(z1 var0) {
      float var1 = (float)n5(var0.e2(), 1, 1.0);
      if (var0.e2() != 1) {
         var1 *= var0.y4();
      }

      float var2 = var1;
      float var3 = var1;
      if (!n5(var0.e2()) && (var0.s7() != u3() || var0.x8() != a6())) {
         var2 *= var0.s7() / u3();
         var3 *= var0.x8() / a6();
      }

      return AffineTransform.getScaleInstance(var2, var3);
   }

   public static Shape n5(Shape var0) {
      if (var0 == null) {
         return null;
      }

      Double[] var1 = new Double[4];
      int var2 = 0;
      boolean var3 = false;
      PathIterator var4 = var0.getPathIterator(null);
      if (var4.isDone()) {
         return var0;
      }

      while (!var4.isDone()) {
         double[] var5 = new double[6];
         byte var6 = (byte)var4.currentSegment(var5);
         switch (var6) {
            case 0:
            case 1:
               if (var2 >= 4) {
                  Double var7 = new Double(var5[0], var5[1]);
                  if (!var7.equals(var1[var2 % var1.length])) {
                     var3 = true;
                  }
               } else {
                  var1[var2] = new Double(var5[0], var5[1]);
                  var2++;
               }
               break;
            case 2:
            case 3:
               var3 = true;
               break;
            case 4:
               if (var2 < 4) {
                  var3 = true;
               }
         }

         if (var3) {
            return var0;
         }

         var4.next();
      }

      double var8 = var1[0].getX();
      double var10 = var1[0].getY();
      double var12 = 0.0;
      double var14 = 0.0;
      boolean var16 = false;

      for (int var17 = 0; var17 < 4; var17++) {
         if (var1[var17].getX() - var8 <= 1.0E-7 && var1[var17].getY() - var10 <= 1.0E-7) {
            var8 = var1[var17].getX();
            var10 = var1[var17].getY();
         }
      }

      var12 = Math.max(Math.abs(var1[1].getX() - var1[0].getX()), Math.abs(var1[1].getX() - var1[2].getX()));
      var14 = Math.max(Math.abs(var1[1].getY() - var1[0].getY()), Math.abs(var1[1].getY() - var1[2].getY()));
      return com.aspose.slides.internal.c9b.a6.n5(var1[0].getX(), var1[0].getY(), var1[2].getX(), var1[2].getY())
               == com.aspose.slides.internal.c9b.a6.n5(var1[1].getX(), var1[1].getY(), var1[3].getX(), var1[3].getY())
            && (var1[0].getX() == var1[1].getX() || var1[0].getY() == var1[1].getY())
         ? new java.awt.geom.Rectangle2D.Double(var8, var10, var12, var14)
         : var0;
   }

   public static Shape n5(Shape var0, AffineTransform var1) {
      return n5(var1.createTransformedShape(var0));
   }

   public static Shape l6(Shape var0) {
      if (var0 == null) {
         return null;
      }

      Shape var1 = n5(var0);
      if (var1 instanceof Rectangle2D) {
         if (var1 instanceof Rectangle) {
            return var1;
         }

         Rectangle2D var7 = var1.getBounds2D();
         float var8 = (float)Math.round(var7.getX() * 100.0) / 100.0F;
         float var9 = (float)Math.round(var7.getY() * 100.0) / 100.0F;
         float var10 = (float)Math.round((var7.getX() + var7.getWidth()) * 100.0) / 100.0F - var8;
         float var11 = (float)Math.round((var7.getY() + var7.getHeight()) * 100.0) / 100.0F - var9;
         return new java.awt.geom.Rectangle2D.Float(var8, var9, var10, var11);
      } else {
         com.aspose.slides.internal.x4g.s7 var2 = com.aspose.slides.internal.x4g.s7.n5((Object)(var0));
         if (var0.getPathIterator(null).isDone()) {
            return var0;
         }

         w1[] var3 = var2.a6();
         byte[] var4 = var2.u9();
         w1[] var5 = new w1[var3.length];

         for (int var6 = 0; var6 < var3.length; var6++) {
            var5[var6] = new w1(Math.round(var3[var6].l6() * 100.0F) / 100.0F, Math.round(var3[var6].k5() * 100.0F) / 100.0F);
         }

         return new com.aspose.slides.internal.x4g.s7(var5, var4).l6();
      }
   }

   public static boolean n5(com.aspose.slides.internal.x4g.s7 var0) {
      return var0.l6().y4().getCurrentPoint() != null;
   }

   public static Dictionary<String, String> n5(IGenericDictionary<String, String> var0) {
      Dictionary var1 = new Dictionary();
      Font[] var2 = GraphicsEnvironment.getLocalGraphicsEnvironment().getAllFonts();

      for (Font var6 : var2) {
         String var7 = n5(var6);
         if (!"".equals(var7) && !var0.containsKey(var7)) {
            var1.set_Item(var7, var7);
         }
      }

      return var1;
   }

   private static String n5(Font var0) {
      try {
         Object var1 = null;

         try {
            var1 = Class.forName("sun.font.FontUtilities").getDeclaredMethod("getFont2D", Font.class).invoke(null, var0);
         } catch (Throwable var5) {
            try {
               var1 = Class.forName("sun.font.FontManager").getDeclaredMethod("getFont2D", Font.class).invoke(null, var0);
            } catch (Throwable var4) {
            }
         }

         Field var2 = Class.forName("sun.font.PhysicalFont").getDeclaredField("platName");
         var2.setAccessible(true);
         return var1 != null ? (String)var2.get(var1) : "";
      } catch (Throwable var6) {
         return "";
      }
   }
}
