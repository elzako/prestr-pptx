package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.internal.k4y.e9w;
import com.aspose.slides.internal.k4y.f5z;
import com.aspose.slides.internal.k4y.g7n;
import com.aspose.slides.internal.k4y.k5x;
import com.aspose.slides.internal.k4y.l2j;
import com.aspose.slides.internal.k4y.l7p;
import com.aspose.slides.internal.k4y.v4a;
import com.aspose.slides.ms.System.IDisposable;

class r6c {
   private static final com.aspose.slides.internal.v6g.u9 n5 = new com.aspose.slides.internal.v6g.u9(
      "arc", "curve", "image", "line", "oval", "polyline", "rect", "roundrect", "shape"
   );

   public static void n5(ISmartArt var0, f5z var1, IShapeCollection var2) {
      com.aspose.slides.internal.k4y.a1h var3 = (com.aspose.slides.internal.k4y.a1h)var1.n5("diagram");
      if (var3 != null) {
         var0.setReversed(var3.n5() == 1 || var3.n5() == 3);
         if (var3.l6() != null) {
            while (var0.getNodes().size() > 0) {
               var0.getNodes().removeNode(var0.getNodes().get_Item(0));
            }

            List var4 = l6(var1);
            com.aspose.slides.internal.k4y.j2m var5 = var3.l6();
            if (var1.s7() == 2 || var1.s7() == 3) {
               r6c$l6 var17 = null;

               for (com.aspose.slides.internal.k4y.x4j var31 : var5.l6()) {
                  if (com.aspose.slides.ms.System.d1.a6(var31.n5(), var31.l6())) {
                     var17 = new r6c$l6(null, var31, var4);
                     var17.n5(var5, var4);
                     break;
                  }
               }

               if (var17 != null) {
                  var17.n5(var0.getNodes(), var2);
               }
            } else if (var1.s7() == 4) {
               List var6 = new List();
               List var7 = new List<>(com.aspose.slides.ms.System.u3.n5(var5.l6()));
               com.aspose.slides.internal.k4y.x4j var8 = n5(var7, false, null);
               if (var8 != null) {
                  com.aspose.slides.internal.k4y.x4j var9 = n5(var7, false, var8.l6());
                  var6.addItem(new r6c$l6(null, var9, var4));

                  for (com.aspose.slides.internal.k4y.x4j var10 = n5(var7, true, var8.n5()); var10 != null; var10 = n5(var7, true, var10.n5())) {
                     r6c$l6 var11 = new r6c$l6(null, var10, var4);
                     var6.addItem(var11);
                  }
               }

               List$Enumerator var24 = var6.iterator();

               try {
                  while (var24.hasNext()) {
                     r6c$l6 var28 = (r6c$l6)var24.next();
                     var28.n5(var0.getNodes(), var2);
                  }
               } finally {
                  if (com.aspose.slides.internal.v6g.k5.n5(var24, IDisposable.class)) {
                     var24.dispose();
                  }
               }
            } else if (var1.s7() == 6 || var1.s7() == 7) {
               for (com.aspose.slides.internal.k4y.x4j var26 : var5.l6()) {
                  if (!com.aspose.slides.ms.System.d1.a6(var26.n5(), var26.l6())) {
                     r6c$l6 var30 = new r6c$l6(null, var26, var4);
                     var30.n5(var0.getNodes(), var2);
                  }
               }
            } else {
               for (com.aspose.slides.internal.k4y.x4j var25 : var5.l6()) {
                  r6c$l6 var29 = new r6c$l6(null, var25, var4);
                  var29.n5(var0.getNodes(), var2);
               }
            }
         }
      }
   }

   private static com.aspose.slides.internal.k4y.x4j n5(List<com.aspose.slides.internal.k4y.x4j> var0, boolean var1, String var2) {
      for (int var3 = 0; var3 < var0.size(); var3++) {
         com.aspose.slides.internal.k4y.x4j var4 = (com.aspose.slides.internal.k4y.x4j)var0.get_Item(var3);
         if (var2 == null && com.aspose.slides.ms.System.d1.a6(var4.l6(), var4.n5())) {
            var0.removeAt(var3);
            return var4;
         }

         if (var1) {
            if (com.aspose.slides.ms.System.d1.a6(var4.l6(), var2)) {
               var0.removeAt(var3);
               return var4;
            }
         } else if (com.aspose.slides.ms.System.d1.a6(var4.n5(), var2)) {
            var0.removeAt(var3);
            return var4;
         }
      }

      return null;
   }

   public static int n5(f5z var0) {
      byte var1 = 78;
      if (var0 != null) {
         switch (var0.s7()) {
            case 2:
               return 78;
            case 3:
               return 17;
            case 4:
               return 114;
            case 5:
               return 16;
            case 6:
               return 20;
            case 7:
               return 18;
            default:
               return var1;
         }
      } else {
         return var1;
      }
   }

   private static List<com.aspose.slides.internal.k4y.m1> l6(f5z var0) {
      List var1 = new List();
      List$Enumerator var2 = var0.t2().iterator();

      try {
         while (var2.hasNext()) {
            com.aspose.slides.internal.k4y.g7 var3 = (com.aspose.slides.internal.k4y.g7)var2.next();
            switch (n5.n5(var3.n5())) {
               case 0:
               case 1:
               case 2:
               case 3:
               case 4:
               case 5:
               case 6:
               case 7:
               case 8:
                  var1.addItem((com.aspose.slides.internal.k4y.m1)var3.l6());
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      return var1;
   }

   public static void n5(IGroupShape var0, f5z var1, IGenericEnumerable<f5z> var2, t5w var3) {
      long[] var4 = a5x.n5(var1.k5(), 10000L);
      float var5 = var0.getRawFrame().getWidth();
      float var6 = var0.getRawFrame().getHeight();
      float var7 = var5 / (float)(var4.length == 2 ? var4[0] : 1000L);
      float var8 = var6 / (float)(var4.length == 2 ? var4[1] : 1000L);
      long[] var9 = a5x.n5(var1.u3(), 0L);
      float var10 = var0.getRawFrame().getX() - (float)(var9.length == 2 ? var9[0] : 0L) * var7;
      float var11 = var0.getRawFrame().getY() - (float)(var9.length == 2 ? var9[1] : 0L) * var8;
      r6c$n5 var12 = new r6c$n5(var10, var11, var7, var8);
      Dictionary var13 = n5(var2);
      ShapeCollection var14 = (ShapeCollection)var0.getShapes();
      List$Enumerator var15 = var1.t2().iterator();

      try {
         while (var15.hasNext()) {
            com.aspose.slides.internal.k4y.g7 var16 = (com.aspose.slides.internal.k4y.g7)var15.next();
            switch (n5.n5(var16.n5())) {
               case 0:
               case 1:
               case 2:
               case 5:
                  n5((l2j)var16.l6(), var14, var12, var3);
                  break;
               case 3:
                  n5((g7n)var16.l6(), var14, var12, var3);
                  break;
               case 4:
                  n5((e9w)var16.l6(), var14, var12, var3);
                  break;
               case 6:
                  n5((l2j)var16.l6(), var14, var12, var3);
                  break;
               case 7:
                  n5((k5x)var16.l6(), var14, var12, var3);
                  break;
               case 8:
                  n5((v4a)var16.l6(), var14, var12, var3, var13);
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var15, IDisposable.class)) {
            var15.dispose();
         }
      }
   }

   private static void n5(g7n var0, ShapeCollection var1, r6c$n5 var2, t5w var3) {
      AutoShape var4 = var1.y4();
      var4.setShapeType(1);
      long[] var5 = a5x.n5(var0.t9(), 10L);
      long[] var6 = a5x.n5(var0.z1(), 10L);
      if (var5.length == 2 && var6.length == 2) {
         float var7 = (float)com.aspose.slides.ms.System.q1.k5(var5[0], var6[0]);
         float var8 = (float)com.aspose.slides.ms.System.q1.n5(var5[0], var6[0]);
         float var9 = (float)com.aspose.slides.ms.System.q1.k5(var5[1], var6[1]);
         float var10 = (float)com.aspose.slides.ms.System.q1.n5(var5[1], var6[1]);
         ShapeFrame var11 = n9s.n5(var0.l6());
         int var12 = var5[0] > var6[0] ? 1 : 0;
         int var13 = var5[1] > var6[1] ? 1 : 0;
         if (var11.getFlipH() != -1) {
            var12 = var11.getFlipH();
         }

         if (var11.getFlipV() != -1) {
            var13 = var11.getFlipV();
         }

         o4f var14 = var4.R_();
         double var15 = (var8 - var7) * var2.k5;
         double var17 = (var10 - var9) * var2.u3;
         var14.n5(new e4c(var7 * var2.k5 + var2.n5, var9 * var2.u3 + var2.l6));
         var4.n5(var15, var17);
         var14.n5(0.0F, (byte)var12, (byte)var13);
         n9v.n5(var4.getFillFormat(), var4.getLineFormat(), var0, var3);
         n5(var4, var0);
         n5(var4);
      }
   }

   private static void n5(l2j var0, ShapeCollection var1, r6c$n5 var2, t5w var3) {
      n5(5, var0, var1, var2, var3);
   }

   private static void n5(k5x var0, ShapeCollection var1, r6c$n5 var2, t5w var3) {
      n5(26, var0, var1, var2, var3);
   }

   private static void n5(e9w var0, ShapeCollection var1, r6c$n5 var2, t5w var3) {
      n5(35, var0, var1, var2, var3);
   }

   private static void n5(v4a var0, ShapeCollection var1, r6c$n5 var2, t5w var3, Dictionary<String, l7p> var4) {
      AutoShape var5 = var1.y4();
      n5(var5, var0, var2);
      l7p var6 = null;
      String var7 = var0.t4();
      if (var7 != null && var7.length() > 0) {
         var7 = com.aspose.slides.ms.System.d1.k5(var7, 1);
      }

      if (var4.containsKey(var7)) {
         var6 = (l7p)var4.get_Item(var7);
      }

      a5x.n5(var5, var0, var6);
      n9v.n5(var5.getFillFormat(), var5.getLineFormat(), var0, var6, var3);
      c8t.n5(var5, var0, var3);
      n5(var5, var0);
      n5(var5);
   }

   private static AutoShape n5(int var0, com.aspose.slides.internal.k4y.m1 var1, ShapeCollection var2, r6c$n5 var3, t5w var4) {
      AutoShape var5 = var2.y4();
      var5.setShapeType(var0);
      var5.addTextFrame("");
      ((TextFrame)var5.getTextFrame()).n5.l6((byte)0);
      var5.getTextFrame().getTextFrameFormat().setAnchoringType((byte)1);
      var5.getTextFrame().getParagraphs().get_Item(0).getParagraphFormat().setAlignment(1);
      n5(var5, var1, var3);
      n9v.n5(var5.getFillFormat(), var5.getLineFormat(), var1, var4);
      c8t.n5(var5, var1, var4);
      n5(var5, var1);
      return var5;
   }

   private static void n5(Shape var0, com.aspose.slides.internal.k4y.m1 var1) {
      long var2 = 0L;
      long[] var4 = new long[]{0L};
      boolean var5 = n5(var1.n5(), var4);
      var2 = var4[0];
      if (var5) {
         var0.h0().n5(var2);
      }
   }

   private static void n5(GeometryShape var0) {
      if (Connector.n5.containsKey(var0.getShapeType())) {
         var0.getLineFormat().setWidth(var0.getLineFormat().getWidth() * 2.0);
      }
   }

   public static boolean n5(String var0, long[] var1) {
      var1[0] = 0L;
      return !com.aspose.slides.ms.System.d1.n5(var0)
         && var0.length() > 2
         && com.aspose.slides.ms.System.l4.n5(com.aspose.slides.ms.System.d1.k5(var0, 2), var1);
   }

   private static void n5(Shape var0, com.aspose.slides.internal.k4y.m1 var1, r6c$n5 var2) {
      ShapeFrame var3 = n9s.n5(var1.l6());
      float var4 = var3.getX();
      float var5 = var3.getY();
      float var6 = var3.getWidth();
      float var7 = var3.getHeight();
      float var8 = var3.getRotation();
      byte var9 = var3.getFlipH();
      byte var10 = var3.getFlipV();
      if (!com.aspose.slides.ms.System.n1.k5(var8) && com.aspose.slides.ms.System.q1.n5(var8) == 270.0F) {
         float var11 = (var4 + var6 / 2.0F) * var2.k5 + var2.n5;
         float var12 = (var5 + var7 / 2.0F) * var2.u3 + var2.l6;
         var6 *= var2.u3;
         var7 *= var2.k5;
         var4 = var11 - var6 / 2.0F;
         var5 = var12 - var7 / 2.0F;
         byte var13 = var10;
         var10 = var9;
         var9 = var13;
      } else {
         var4 = var4 * var2.k5 + var2.n5;
         var5 = var5 * var2.u3 + var2.l6;
         var6 *= var2.k5;
         var7 *= var2.u3;
      }

      o4f var18 = var0.R_();
      var18.n5(new e4c(var4, var5));
      var0.n5((double)var6, (double)var7);
      var18.n5(var8, var9, var10);
   }

   private static Dictionary<String, l7p> n5(IGenericEnumerable<f5z> var0) {
      Dictionary var1 = new Dictionary();
      IGenericEnumerator var2 = var0.iterator();

      try {
         while (var2.hasNext()) {
            f5z var3 = (f5z)var2.next();
            List$Enumerator var4 = var3.t2().iterator();

            try {
               while (var4.hasNext()) {
                  com.aspose.slides.internal.k4y.g7 var5 = (com.aspose.slides.internal.k4y.g7)var4.next();
                  if ("shapetype".equals(var5.n5())) {
                     l7p var6 = (l7p)var5.l6();
                     var1.addItem(var6.n5(), var6);
                  }
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
                  var4.dispose();
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      return var1;
   }
}
