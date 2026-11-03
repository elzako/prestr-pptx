package com.aspose.slides.internal.r5w;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.o9b.e5;
import com.aspose.slides.internal.o9b.n3;
import com.aspose.slides.internal.o9b.z1;
import com.aspose.slides.internal.x4g.m1;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.font.TextAttribute;
import java.awt.font.TransformAttribute;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class k5 {
   public static final Boolean n5 = n5("1.7.0_21", "java.version");
   public static final Boolean l6 = n5("1.6.0_45", "java.version");
   public static final Boolean k5 = n5("oracle corporation", "java.vendor");

   public static n3 n5(n3 var0, e5 var1, int var2) {
      String var3 = var0.h0();
      n3 var4 = var0;
      HashMap var5 = new HashMap();
      if (var3.equalsIgnoreCase("SimSun") && (var0.x8() & 1) != 0) {
         if (var2 != 0 || var1 != null && var1.q0()) {
            if (var2 == 0 && var1 != null && var1.q0()) {
               var5.put(TextAttribute.TRACKING, TextAttribute.TRACKING_TIGHT);
               var5.put(TextAttribute.TRANSFORM, new TransformAttribute(m1.k5(new m1(0.99214F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F))));
               var4 = n3.n5(var0, var5);
            } else if (var2 != 4 || var1 != null && var1.q0()) {
               var5.put(TextAttribute.TRACKING, TextAttribute.TRACKING_TIGHT);
               var5.put(TextAttribute.TRANSFORM, new TransformAttribute(m1.k5(new m1(0.99216F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F))));
               var4 = n3.n5(var0, var5);
            } else {
               var5.put(TextAttribute.TRACKING, TextAttribute.TRACKING_TIGHT);
               var5.put(TextAttribute.TRANSFORM, new TransformAttribute(m1.k5(new m1(0.99216F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F))));
               var4 = n3.n5(var0, var5);
            }
         } else {
            var5.put(TextAttribute.TRACKING, TextAttribute.TRACKING_TIGHT);
            var5.put(TextAttribute.TRANSFORM, new TransformAttribute(m1.k5(new m1(0.99216F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F))));
            var4 = n3.n5(var0, var5);
         }
      } else if (var1 != null && var1.q0()) {
         if (var3.equalsIgnoreCase("Adobe Clean Display Black") && (var0.x8() & 1) != 0) {
            var5.put(TextAttribute.TRACKING, TextAttribute.TRACKING_TIGHT);
            var5.put(TextAttribute.TRANSFORM, new TransformAttribute(m1.k5(new m1(0.97016F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F))));
            var4 = n3.n5(var0, var5);
         }
      } else if (var2 == 4 || var2 == 2 || var2 == 3) {
         Float var6 = 0.014F;
         var5.put(TextAttribute.TRACKING, var6);
         var4 = n3.n5(var0, var5);
      }

      return var4;
   }

   public static n3 n5(n3 var0, String var1) {
      return l6(var0, var1) ? new n3("Arial", var0.c8(), var0.x8(), var0.y4()) : var0;
   }

   public static Map n5(Map var0, int var1, boolean var2) {
      Map var3;
      if (var2) {
         var3 = new Hashtable(var0.size());

         for (Object var5 : var0.keySet()) {
            Object var6 = var0.get(var5);
            if (var6 != null) {
               var3.put(var5, var6);
            }
         }
      } else {
         var3 = var0;
      }

      if ((var1 & 1) == 1) {
         var3.put(TextAttribute.WEIGHT, TextAttribute.WEIGHT_BOLD);
      } else {
         var3.put(TextAttribute.WEIGHT, TextAttribute.WEIGHT_REGULAR);
      }

      if ((var1 & 2) == 2) {
         var3.put(TextAttribute.POSTURE, TextAttribute.POSTURE_OBLIQUE);
      } else {
         var3.put(TextAttribute.POSTURE, TextAttribute.POSTURE_REGULAR);
      }

      if ((var1 & 4) == 4) {
         var3.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
      } else {
         var3.remove(TextAttribute.UNDERLINE);
      }

      if ((var1 & 8) == 8) {
         var3.put(TextAttribute.STRIKETHROUGH, TextAttribute.STRIKETHROUGH_ON);
      } else {
         var3.remove(TextAttribute.STRIKETHROUGH);
      }

      return var3;
   }

   public static Font n5(String var0, float var1, com.aspose.slides.internal.v7u.n5 var2) {
      Font var3 = null;
      Font[] var4 = var2.l6().l6(var0);
      if (var4 != null) {
         var3 = var4[0];
      }

      if (var3 == null) {
         String var5 = com.aspose.slides.internal.f3l.u3.n5(1).a6();

         for (Font var9 : new com.aspose.slides.internal.v7u.l6().l6().l6(var5)) {
            var3 = var9;
         }

         var0 = var5;
      }

      int[] var12 = new int[]{3};
      byte[] var13 = new byte[]{1};
      boolean[] var14 = new boolean[]{false};
      HashMap[] var15 = new HashMap[]{null};
      float[] var16 = new float[]{var1};
      Font[] var10 = new Font[]{null};
      String[] var11 = new String[]{var0};
      n5(var0, var3, var1, 0, 3, (byte)1, false, var12, var13, var14, var15, var16, var10, var11);
      return var10[0];
   }

   private static void n5(
      String var0,
      Font var1,
      float var2,
      int var3,
      int var4,
      byte var5,
      boolean var6,
      int[] var7,
      byte[] var8,
      boolean[] var9,
      Map<TextAttribute, Object>[] var10,
      float[] var11,
      Font[] var12,
      String[] var13
   ) {
      if (Float.isNaN(var2) || Float.isInfinite(var2) || var2 <= 0.0F) {
         throw new ArgumentException("Parameter 'emSize' is invalid");
      }

      if (var4 == 1) {
         throw new ArgumentException("Parameter 'unit' cannot be Graphics.Display");
      }

      var7[0] = var4;
      var8[0] = var5;
      var9[0] = var6;
      var10[0] = new HashMap();
      var10[0].put(TextAttribute.FAMILY, var0);
      var10[0].put(TextAttribute.POSTURE, TextAttribute.POSTURE_REGULAR);
      var10[0].put(TextAttribute.WEIGHT, TextAttribute.WEIGHT_REGULAR);
      var11[0] = var2;
      double var14 = var11[0];
      if (var7[0] != 2) {
         var14 = com.aspose.slides.internal.r5w.n5.n5(var7[0], 2, (double)var11[0]);
      }

      var10[0].put(TextAttribute.SIZE, new Float(var14));
      n5(var10[0], var3, false);
      var12[0] = var1.deriveFont(var10[0]);
      if (!var12[0].getFamily().matches(var0)) {
         var10[0].remove(TextAttribute.FAMILY);
         Font var16 = var1.deriveFont((float)var14);
         var12[0] = var16.deriveFont(var10[0]);
      }

      var13[0] = var12[0].getName();
   }

   public static n3 n5(z1 var0, n3 var1) {
      double var2;
      if (com.aspose.slides.internal.r5w.n5.n5(var1.y4())) {
         if (com.aspose.slides.internal.r5w.n5.n5(var0.e2())) {
            var2 = var1.c8();
         } else {
            var2 = var1.c8() * (var0.x8() / com.aspose.slides.internal.r5w.n5.a6());
         }
      } else {
         float var4 = var0.y4();
         if (var0.e2() == 1) {
            var4 = 1.0F;
         }

         float var5 = var1.c8() / var4 * (var0.x8() / com.aspose.slides.internal.r5w.n5.a6());
         var2 = com.aspose.slides.internal.r5w.n5.n5(var1.y4(), var0.e2(), (double)var5);
      }

      return n3.n5(var1, (float)var2, var0.e2());
   }

   public static float[] l6(z1 var0, n3 var1) {
      if (var0 == null) {
         return new float[]{0.0F};
      }

      float var2 = z1.n5(var0).getFontMetrics(n3.n5(var1)).charWidth(' ');
      boolean var3 = k5(var0, var1);
      return !var3 ? new float[]{var2 * (9.5F + var1.c8() * 0.4F)} : new float[]{var2 * (5.5F + var1.c8() * 0.1F)};
   }

   public static boolean k5(z1 var0, n3 var1) {
      return u3(var0, var1) != -1.0F;
   }

   private static float u3(z1 var0, n3 var1) {
      FontMetrics var2 = z1.n5(var0).getFontMetrics(n3.n5(var1));
      int[] var3 = var2.getWidths();
      int[] var4 = var3.length > 8 ? new int[]{0, 1, 2, 5, 8} : new int[0];
      char[] var5 = new char[]{' ', '3', 'i', 'I', '|', '.', 'W', 'm', 'X', '@'};
      int var6 = 0;

      for (int var10 : var4) {
         if (var6 == 0 && var3[var10] != 0) {
            var6 = var3[var10];
         }

         if (var6 != 0 && var3[var10] != var6) {
            return -1.0F;
         }
      }

      if (var6 == 0) {
         var6 = var2.charWidth(var5[0]);
      }

      for (char var15 : var5) {
         int var11 = var2.charWidth(var15);
         if (var6 == 0 && var11 != 0) {
            var6 = var11;
         }

         if (var6 != 0 && var11 != var6) {
            return -1.0F;
         }
      }

      return var6;
   }

   private static Boolean n5(String var0, String var1) {
      try {
         String var2 = System.getProperty(var1);
         return var0.equalsIgnoreCase(var2);
      } catch (Exception var3) {
         return null;
      }
   }

   public static boolean n5(n3 var0) {
      return !"Calibri".equalsIgnoreCase(var0.h0()) ? false : l6 == null && n5 == null || l6 != null && l6 || n5 != null && n5;
   }

   public static boolean l6(n3 var0, String var1) {
      if (k5 != null && (k5 == null || k5)) {
         if (!var0.n5()) {
            return false;
         }

         if (!"Times New Roman".equalsIgnoreCase(var0.h0())) {
            return false;
         }

         boolean var2 = true;

         for (int var3 = 0; var3 < var1.length(); var3++) {
            byte var4 = Character.getDirectionality(var1.charAt(var3));
            if (var4 == 2) {
               var2 = false;
               break;
            }
         }

         return !var2;
      } else {
         return false;
      }
   }

   public static String n5(String var0) {
      if (var0 != null && var0.length() != 0) {
         int var1 = var0.length();
         int var2 = var1;

         while (var1-- > 0 && (var0.charAt(var1) == ' ' || var0.charAt(var1) == '\t' || var0.charAt(var1) == '\r' || var0.charAt(var1) == '\n')) {
            var2 = var1;
         }

         return var2 == var0.length() ? var0 : var0.substring(0, var2);
      } else {
         return var0;
      }
   }
}
