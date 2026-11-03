package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.Dictionary$ValueCollection$Enumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

class v8v extends DomObject<SmartArt> {
   private final w4a n5;
   private final k6a l6;
   private final List<k6a> k5;
   private final GroupShape u3;
   private e4c a6 = new e4c();

   public final w4a n5() {
      return this.n5;
   }

   public final SmartArt l6() {
      return this.u9;
   }

   public final GroupShape k5() {
      return this.u3;
   }

   public final e4c u3() {
      return this.a6;
   }

   public v8v(SmartArt var1, com.aspose.slides.internal.k4y.y5g var2, l6s var3) {
      super(var1);
      this.n5 = (w4a)g3c.n5(this, var2, null);
      this.n5().n5(null, var3);
      this.l6 = this.n5().k5().get_Item(0);
      this.l6.u9().addItem(var3);
      this.k5 = new List<>();
      n5(this.l6, this.k5, false);
      this.u3 = new GroupShape((ShapeCollection)this.l6().getSlide().getShapes());
      GroupShapeLock var4 = (GroupShapeLock)this.u3.getShapeLock();
      var4.setGroupingLocked(true);
      var4.setPositionLocked(true);
      var4.setRotationLocked(true);
      var4.setSizeLocked(true);
      var4.setUngroupingLocked(true);
      ShapeCollection var5 = (ShapeCollection)this.u3.getShapes();
      List var6 = this.t2();
      List$Enumerator var7 = var6.iterator();

      try {
         while (var7.hasNext()) {
            k7t var8 = (k7t)var7.next();
            SmartArtShape var9 = var8.l6();
            var9.a6(this.u9.t1());
            var9.setDecorative(this.u9.isDecorative());
            var9.l6(var5);
            var5.n5(var9);
            var9.m3().n5(var9);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var7, IDisposable.class)) {
            var7.dispose();
         }
      }

      n5(var6);
   }

   public final void n5(o1o var1) {
      this.l6.n5(var1);
   }

   public final void n5(t6w var1) {
      this.l6.n5(var1);
   }

   public final void n5(SmartArtNode var1) {
      var1.n5(this.k5);
   }

   public final k6a n5(String var1) {
      List$Enumerator var2 = this.k5.iterator();

      try {
         while (var2.hasNext()) {
            k6a var3 = (k6a)var2.next();
            if (com.aspose.slides.ms.System.d1.a6(var3.t9(), var1)) {
               return var3;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      return null;
   }

   public final void a6() {
      this.a6 = new e4c(this.l6().getWidth(), this.l6().getHeight());
      this.l6.c4();
      this.l6.l6(61, this.u3().n5);
      this.l6.l6(15, this.u3().l6);
      this.n5().t4();
      this.n5().c8();
      if (this.l6.s7().n5(this.l6, this.u3().u9())) {
         this.l6.d2();
         this.l6.w1();
         this.n5().c8();
      }

      this.l6.y1();
      this.l6.a0();
   }

   public final void u9() {
      List$Enumerator var1 = this.k5.iterator();

      try {
         while (var1.hasNext()) {
            k6a var2 = (k6a)var1.next();
            SmartArtShape var3 = var2.c8().l6();
            if (var3 != null && var3.k5() != null && !com.aspose.slides.ms.System.d1.a6(var3.k5().getText(), com.aspose.slides.ms.System.d1.n5)) {
               this.l6().n5().u3();
               break;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var1, IDisposable.class)) {
            var1.dispose();
         }
      }

      List$Enumerator var13 = this.k5.iterator();

      try {
         while (var13.hasNext()) {
            k6a var14 = (k6a)var13.next();
            SmartArtShape var4 = var14.c8().l6();
            if (var4 != null && var4.k5() != null && !com.aspose.slides.ms.System.d1.a6(var4.k5().getText(), com.aspose.slides.ms.System.d1.n5)) {
               o4f var5 = var4.s3();
               var14.c8().n5(var5);
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var13, IDisposable.class)) {
            var13.dispose();
         }
      }
   }

   public final void h0() {
      List$Enumerator var1 = this.k5.iterator();

      try {
         while (var1.hasNext()) {
            k6a var2 = (k6a)var1.next();
            if (var2.c8().l6() != null) {
               this.n5(var2);
            } else {
               var2.y4().k5().n5(0);
               var2.y4().k5().l6(0);
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var1, IDisposable.class)) {
            var1.dispose();
         }
      }
   }

   final int c8() {
      int var1 = Integer.MIN_VALUE;
      List$Enumerator var2 = this.k5.iterator();

      try {
         while (var2.hasNext()) {
            k6a var3 = (k6a)var2.next();
            if (var1 < var3.z1()) {
               var1 = var3.z1();
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      return var1;
   }

   private List<k7t> t2() {
      List var1 = new List();
      boolean var2 = this.n5().u9() == 2;
      List var3 = new List();
      n5(this.l6, var3, true);
      int var4 = var3.size();
      int var5 = 0;

      for (int var6 = var2 ? var4 - 1 : 0; var2 ? var6 >= 0 : var6 < var4; var6 += var2 ? -1 : 1) {
         k7t var7 = ((k6a)var3.get_Item(var6)).c8();
         if (var7.l6() != null) {
            var1.addItem(var7);
            var7.n5(var5);
            var5++;
         }
      }

      var1.sort();
      return var1;
   }

   private static void n5(List<k7t> var0) {
      Dictionary var1 = new Dictionary();
      List$Enumerator var2 = var0.iterator();

      try {
         while (var2.hasNext()) {
            k7t var3 = (k7t)var2.next();
            String var4 = var3.n5().h0().u3();
            if (com.aspose.slides.ms.System.d1.n5(var4)) {
               var4 = l6(var3.n5());
            }

            var3.n5().y4().k5().k5(var4);
            if (!var1.containsKey(var4)) {
               List var5 = new List();
               var5.addItem(var3.n5());
               var1.addItem(var4, var5);
            } else {
               ((List)var1.get_Item(var4)).addItem(var3.n5());
            }

            var3.n5().y4().k5().n5(-1);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      Dictionary$ValueCollection$Enumerator var34 = var1.getValues().iterator();

      try {
         while (var34.hasNext()) {
            List var35 = (List)var34.next();
            int var36 = 0;

            for (int var6 = 0; var6 < var35.size(); var6++) {
               k6a var7 = (k6a)var35.get_Item(var6);
               if (var7.y4().k5().a6() == -1) {
                  var7.y4().k5().n5(var36);
                  l6s var8 = var7.u9().size() > 0 ? var7.u9().get_Item(0) : var7.a6();
                  if (var8.e2() == 3) {
                     k6a var9 = var7.u3();
                     if (var9 != null && (var9.u9().containsItem(var8) || var9.a6() == var8) && var9.c8().t4()) {
                        var9.y4().k5().n5(var36);
                     }
                  } else {
                     List$Enumerator var39 = var35.iterator();

                     try {
                        while (var39.hasNext()) {
                           k6a var10 = (k6a)var39.next();
                           if (var10 != var7 && (var10.u9().containsItem(var8) || var10.a6() == var8)) {
                              var10.y4().k5().n5(var36);
                           }
                        }
                     } finally {
                        if (com.aspose.slides.internal.v6g.k5.n5(var39, IDisposable.class)) {
                           var39.dispose();
                        }
                     }
                  }

                  var36++;
               }
            }

            List$Enumerator var37 = var35.iterator();

            try {
               while (var37.hasNext()) {
                  k6a var38 = (k6a)var37.next();
                  var38.y4().k5().l6(var36);
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var37, IDisposable.class)) {
                  var37.dispose();
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var34, IDisposable.class)) {
            var34.dispose();
         }
      }
   }

   private void n5(k6a var1) {
      k7t var2 = var1.c8();
      SmartArtShape var3 = var2.l6();
      boolean var4 = var2.z3();
      w4c var5 = var1.y4();
      com.aspose.slides.internal.k4y.a6w var6 = var5.k5();
      String var7 = var6.u3();
      String var8 = l6(var1);
      com.aspose.slides.internal.k4y.p3b var9 = this.l6(var7);
      if (var9 == null) {
         var9 = this.l6(var8);
      }

      com.aspose.slides.internal.k4y.p3b var10 = var9;
      com.aspose.slides.internal.k4y.b8s var11 = this.k5(var7);
      if (var11 == null) {
         var11 = this.k5(var8);
      }

      com.aspose.slides.internal.k4y.b8s var12 = var11;
      if (var10 != null && var12 != null) {
         com.aspose.slides.internal.k4y.g7 var13 = var10.l6().l6().l6();
         com.aspose.slides.internal.k4y.g7 var14 = var10.l6().n5().l6();
         com.aspose.slides.internal.k4y.g7 var15 = var10.l6().u3().l6();
         long var16 = var10.l6().l6().n5();
         long var18 = var10.l6().n5().n5();
         byte var20 = var10.l6().u3().n5();
         int var21 = var6.a6();
         int var22 = var6.u9();
         com.aspose.slides.internal.k4y.d9m var23 = var3.m3().k5().m3();
         if (var23 != null) {
            var10.l6().l6().n5(var23.l6().l6());
            var10.l6().l6().n5(var23.l6().n5());
         } else if (var12.l6() != null) {
            com.aspose.slides.internal.k4y.g7 var24 = this.n5(var12.l6(), var21, var22);
            if (var24 != null) {
               var10.l6().l6().n5(var24);
            }

            if (var4) {
               var10.l6().l6().n5(0L);
            }
         }

         if (var23 != null) {
            var10.l6().n5().n5(var23.n5().l6());
            var10.l6().n5().n5(var23.n5().n5());
         } else if (var12.k5() != null) {
            com.aspose.slides.internal.k4y.g7 var25 = this.n5(var4 && (var10.l6().n5().n5() & 4294967295L) == 0L ? var12.l6() : var12.k5(), var21, var22);
            if (var25 != null) {
               var10.l6().n5().n5(var25);
               if (var4 && (var10.l6().n5().n5() & 4294967295L) == 0L) {
                  var10.l6().n5().n5(1L);
               }
            }
         }

         if (var12.u3() == null) {
            if (var23 != null) {
               var10.l6().u3().n5(var23.u3().l6());
               var10.l6().u3().n5(var23.u3().n5());
            }
         } else {
            com.aspose.slides.internal.k4y.g7 var26 = this.n5(var12.u3(), var21, var22);
            if ((var26 == null || !var5.c8() && !com.aspose.slides.internal.v6g.k5.l6(var1.s7(), h3o.class)) && var3.getShapeType() != 8) {
               if (var23 != null) {
                  var10.l6().u3().n5(var23.u3().l6());
                  var10.l6().u3().n5(var23.u3().n5());
               }
            } else {
               var10.l6().u3().n5(var26);
            }
         }

         h1o.n5(var3, var10.l6());
         var10.l6().l6().n5(var13);
         var10.l6().n5().n5(var14);
         var10.l6().u3().n5(var15);
         var10.l6().l6().n5(var16);
         var10.l6().n5().n5(var18);
         var10.l6().u3().n5(var20);
      }
   }

   private com.aspose.slides.internal.k4y.p3b l6(String var1) {
      for (com.aspose.slides.internal.k4y.p3b var5 : this.l6().u9().a6().u3()) {
         if (com.aspose.slides.ms.System.d1.a6(var5.n5(), var1)) {
            return var5;
         }
      }

      return null;
   }

   private com.aspose.slides.internal.k4y.b8s k5(String var1) {
      for (com.aspose.slides.internal.k4y.b8s var5 : this.l6().u9().n5().k5()) {
         if (com.aspose.slides.ms.System.d1.a6(var5.n5(), var1)) {
            return var5;
         }
      }

      return null;
   }

   private com.aspose.slides.internal.k4y.g7 n5(com.aspose.slides.internal.k4y.f5w var1, int var2, int var3) {
      com.aspose.slides.internal.o9b.c8 var4 = com.aspose.slides.internal.o9b.c8.u3.o8();
      if (var1.n5() != 0) {
         if (var1.l6().size() > 1) {
            ColorFormat var5 = n5(var1.l6().get_Item(0));
            ColorFormat var6 = n5(var1.l6().get_Item(1));
            if (var1.n5() == 2) {
               this.l6(var5, var6, var2, var3).n5(var4);
            } else if (var1.n5() == 1) {
               this.n5(var5, var6, var2, var3).n5(var4);
            } else {
               n5(var1.l6().get_Item(var2 % var1.l6().size())).k5(this.l6().getSlide(), null).n5(var4);
            }
         } else if (var1.l6().size() > 0) {
            n5(var1.l6().get_Item(0)).k5(this.l6().getSlide(), null).n5(var4);
         }
      }

      if (com.aspose.slides.internal.o9b.c8.n5(var4, com.aspose.slides.internal.o9b.c8.u3)) {
         return null;
      }

      com.aspose.slides.internal.k4y.e8p var7 = new com.aspose.slides.internal.k4y.e8p();
      var7.n5(((var4.x8() & 255) << 16 | (var4.n3() & 255) << 8 | var4.y4() & 0xFF) & 4294967295L);
      if ((var4.s7() & 255) != 255) {
         com.aspose.slides.internal.k4y.d2n var8 = new com.aspose.slides.internal.k4y.d2n();
         var8.n5((float)((var4.s7() & 0xFF) * 100.0 / 255.0));
         var7.n5(new com.aspose.slides.internal.k4y.g7("alpha", var8));
      }

      return new com.aspose.slides.internal.k4y.g7("srgbClr", var7);
   }

   private com.aspose.slides.internal.o9b.c8 n5(ColorFormat var1, ColorFormat var2, int var3, int var4) {
      if (var4 == 0) {
         return var1.u3();
      }

      r0s var5 = var1.l6(this.l6().getSlide());
      r0s var6 = var2.l6(this.l6().getSlide());
      float var7 = 0.0F;
      float var8 = 0.0F;
      float var9 = 0.0F;
      float var10 = 0.0F;
      float var11 = 0.0F;
      float var12 = 0.0F;
      float[] var13 = new float[]{0.0F};
      float[] var14 = new float[]{0.0F};
      float[] var15 = new float[]{0.0F};
      ColorFormat.n5(var5.l6, var5.k5, var5.u3, var13, var14, var15);
      var7 = var13[0];
      var8 = var14[0];
      var9 = var15[0];
      float[] var16 = new float[]{0.0F};
      float[] var17 = new float[]{0.0F};
      float[] var18 = new float[]{0.0F};
      ColorFormat.n5(var6.l6, var6.k5, var6.u3, var16, var17, var18);
      var10 = var16[0];
      var11 = var17[0];
      var12 = var18[0];
      float var19 = var4 - 1 == 0 ? 0.0F : (float)var3 / (var4 - 1);
      float var20 = 1.0F - var19;
      float var21 = var20 * var7 + var19 * var10;
      float var22 = var20 * var8 + var19 * var11;
      float var23 = var20 * var9 + var19 * var12;
      r0s var24 = ColorFormat.u3(var21, var22, var23);
      var24.n5 = var20 * var5.n5 + var19 * var6.n5;
      return var24.n5();
   }

   private com.aspose.slides.internal.o9b.c8 l6(ColorFormat var1, ColorFormat var2, int var3, int var4) {
      r0s var5 = var1.l6(this.l6().getSlide());
      r0s var6 = var2.l6(this.l6().getSlide());
      float var7 = 0.0F;
      float var8 = 0.0F;
      float var9 = 0.0F;
      float var10 = 0.0F;
      float var11 = 0.0F;
      float var12 = 0.0F;
      float[] var13 = new float[]{0.0F};
      float[] var14 = new float[]{0.0F};
      float[] var15 = new float[]{0.0F};
      ColorFormat.n5(var5.l6, var5.k5, var5.u3, var13, var14, var15);
      var7 = var13[0];
      var8 = var14[0];
      var9 = var15[0];
      float[] var16 = new float[]{0.0F};
      float[] var17 = new float[]{0.0F};
      float[] var18 = new float[]{0.0F};
      ColorFormat.n5(var6.l6, var6.k5, var6.u3, var16, var17, var18);
      var10 = var16[0];
      var11 = var17[0];
      var12 = var18[0];
      int var19 = com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.l6((double)(var4 / 2.0F)), 14);
      boolean var20 = var3 >= var19;
      int var21 = var20 ? var3 - var19 + var4 % 2 : var3;
      float var22 = var19 == 0 ? 0.0F : (float)var21 / var19;
      float var23 = var20 ? 1.0F - var22 : var22;
      float var24 = var20 ? var22 : 1.0F - var22;
      float var25 = var24 * var7 + var23 * var10;
      float var26 = var24 * var8 + var23 * var11;
      float var27 = var24 * var9 + var23 * var12;
      r0s var28 = ColorFormat.u3(var25, var26, var27);
      var28.n5 = var24 * var5.n5 + var23 * var6.n5;
      return var28.n5();
   }

   private static ColorFormat n5(com.aspose.slides.internal.k4y.g7 var0) {
      ColorFormat var1 = new ColorFormat(null);
      c4i.n5(var1, var0);
      return var1;
   }

   private static void n5(k6a var0, List<k6a> var1, boolean var2) {
      var1.addItem(var0);
      if (var2) {
         List$Enumerator var3 = var0.l6().iterator();

         try {
            while (var3.hasNext()) {
               k6a var4 = (k6a)var3.next();
               if (!var4.c8().t4() || !com.aspose.slides.internal.v6g.k5.l6(var4.s7(), h3o.class)) {
                  n5(var4, var1, var2);
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
               var3.dispose();
            }
         }

         List$Enumerator var21 = var0.l6().iterator();

         try {
            while (var21.hasNext()) {
               k6a var5 = (k6a)var21.next();
               if (var5.c8().t4() && com.aspose.slides.internal.v6g.k5.l6(var5.s7(), h3o.class)) {
                  n5(var5, var1, var2);
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var21, IDisposable.class)) {
               var21.dispose();
            }
         }
      } else {
         List$Enumerator var20 = var0.l6().iterator();

         try {
            while (var20.hasNext()) {
               k6a var22 = (k6a)var20.next();
               n5(var22, var1, var2);
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var20, IDisposable.class)) {
               var20.dispose();
            }
         }
      }
   }

   private static String l6(k6a var0) {
      com.aspose.slides.internal.l7h.a5 var1 = new com.aspose.slides.internal.l7h.a5();
      l6s var2 = var0.u9().size() > 0 ? var0.u9().get_Item(0) : var0.a6();
      switch (var2.e2()) {
         case 2:
            var1.n5("asst");
            break;
         case 3:
         case 4:
         default:
            var1.n5("node");
            break;
         case 5:
            var1.n5("parChTrans");
            break;
         case 6:
            var1.n5("sibTrans");
      }

      if (var2.e2() == 6 || var0.a6().e2() == 5) {
         var1.n5(var0.s7().k5() ? "2D" : "1D");
      }

      int var3 = var2.z1();
      if (var3 > 0 && var2.e2() == 2) {
         var3--;
      } else if (var3 == 0 && var2.e2() == 3) {
         var3 = 1;
      }

      var1.k5(com.aspose.slides.ms.System.q1.l6(4, var3));
      return var1.toString();
   }
}
