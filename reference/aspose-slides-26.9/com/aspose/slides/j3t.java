package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.ms.System.IDisposable;

class j3t extends l5x {
   private static final com.aspose.slides.internal.r7c.c8 n5 = new com.aspose.slides.internal.r7c.c8(
      com.aspose.slides.ms.System.d1.n5("Master([0-9]+)\\-", new Object[]{"index"}), 0
   );

   final void n5(Presentation var1) {
      this.n5(new String[0]);

      while (this.s7().u9()) {
         if (this.s7().s7() == 1 && "document-styles".equals(this.s7().n3())) {
            this.l6().u3().throwIfInterruptionRequested();
            com.aspose.slides.internal.k4y.t1g var2 = new com.aspose.slides.internal.k4y.t1g(this.s7());
            this.n5(var2);
            this.n5(var1, var2);
            this.l6(var1);
         }
      }

      this.n3();
   }

   final void n5(Presentation var1, b8u var2) {
      this.y4();
      com.aspose.slides.internal.k4y.t1g var3 = new com.aspose.slides.internal.k4y.t1g();
      this.k5().n5(var3);
      var3.n5();
      this.l6(var1, var3);
      var2.l6(var1);
      var3.n5(null, this.x8(), "document-styles");
      this.e2();
   }

   public j3t(com.aspose.slides.internal.c8m.z5 var1, z5q var2) {
      super(var1, var2);
   }

   public j3t(com.aspose.slides.internal.c8m.z5 var1, OdpSerializationContext var2) {
      super(var1, var2);
   }

   private void n5(com.aspose.slides.internal.k4y.t1g var1) {
      i5s var2 = new i5s(var1.u3(), var1.a6(), var1.u9());
      this.l6().n5(var2);
   }

   private void n5(Presentation var1, com.aspose.slides.internal.k4y.t1g var2) {
      h6j var3 = new h6j(this.l6(), var2.a6());
      IMasterSlide var4 = var1.getMasters().get_Item(0);
      var4.getShapes().clear();
      IGenericList var5 = this.t2();
      if (var5.size() > 1) {
         for (int var6 = 1; var6 < var5.size(); var6++) {
            var1.getMasters().addClone(var4);
         }
      }

      for (int var22 = 0; var22 < var5.size(); var22++) {
         KeyValuePair var7 = ((KeyValuePair)var5.get_Item(var22)).Clone();
         MasterSlide var8 = (MasterSlide)var1.getMasters().get_Item(var22);
         this.n5(var8);
         x3v.n5(var8, (com.aspose.slides.internal.k4y.u9t)var7.getKey(), var3);

         for (int var9 = 0; var9 < ((IGenericList)var7.getValue()).size(); var9++) {
            com.aspose.slides.internal.k4y.u9t var10 = (com.aspose.slides.internal.k4y.u9t)((IGenericList)var7.getValue()).get_Item(var9);
            ILayoutSlide var11;
            if (var8.getLayoutSlides().size() > var9) {
               var11 = var8.getLayoutSlides().get_Item(var9);
               var11.getShapes().clear();
            } else {
               var11 = var8.l6((byte)11);
               ((LayoutSlide)var11).t4().n5(var1.n3().w1());
            }

            p4e.n5(var11, var10, var3);
         }

         if (((IGenericList)var7.getValue()).size() == 0) {
            IGenericEnumerator var25 = var8.getLayoutSlides().iterator();

            try {
               while (var25.hasNext()) {
                  LayoutSlide var26 = (LayoutSlide)var25.next();
                  var26.setShowMasterShapes(false);
                  IGenericEnumerator var27 = var8.getShapes().iterator();

                  try {
                     while (var27.hasNext()) {
                        Shape var12 = (Shape)var27.next();
                        if (var12.getPlaceholder() == null) {
                           var26.getShapes().addClone(var12);
                        }
                     }
                  } finally {
                     if (com.aspose.slides.internal.v6g.k5.n5(var27, IDisposable.class)) {
                        var27.dispose();
                     }
                  }

                  BaseSlideHeaderFooterManager var28 = (BaseSlideHeaderFooterManager)var26.getHeaderFooterManager();
                  if (var8.getHeaderFooterManager().isSlideNumberVisible()) {
                     AutoShape var13 = (AutoShape)var8.n5((byte)5);
                     AutoShape var14 = (AutoShape)var26.n5((byte)5);
                     if (var14 != null) {
                        var14.l6().n5((ITextFrame)var13.l6());
                     }
                  } else {
                     var28.setSlideNumberVisibility(false);
                  }

                  if (var8.getHeaderFooterManager().isFooterVisible()) {
                     AutoShape var29 = (AutoShape)var8.n5((byte)6);
                     AutoShape var31 = (AutoShape)var26.n5((byte)6);
                     if (var31 != null) {
                        var31.l6().n5((ITextFrame)var29.l6());
                     }
                  } else {
                     var28.setFooterVisibility(false);
                  }

                  if (var8.getHeaderFooterManager().isDateTimeVisible()) {
                     AutoShape var30 = (AutoShape)var8.n5((byte)4);
                     AutoShape var32 = (AutoShape)var26.n5((byte)4);
                     if (var32 != null) {
                        var32.l6().k5(var30.l6());
                     }
                  } else {
                     var28.setDateTimeVisibility(false);
                  }
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var25, IDisposable.class)) {
                  var25.dispose();
               }
            }
         }
      }

      if (this.l6().l6().e2() != null) {
         com.aspose.slides.internal.k4y.m4n var23 = this.l6().l6().e2();
         IMasterHandoutSlide var24 = var1.getMasterHandoutSlideManager().setDefaultMasterHandoutSlide();
         k6l.n5((MasterHandoutSlide)var24, var23, var3);
      }
   }

   private void n5(MasterSlide var1) {
      TextStyle var2 = (TextStyle)var1.getBodyStyle();
      var2.h0();
   }

   private void l6(Presentation var1) {
      float[] var2 = this.n5();
      ((SlideSize)var1.getSlideSize()).setSize(var2[0], var2[1], 0);
      var1.getSlideSize().setOrientation(var2[2] == 0.0F ? 0 : 1);
      float[] var3 = this.c8();
      ((NotesSize)var1.getNotesSize()).n5(new com.aspose.slides.internal.o9b.f2(var3[0], var3[1]));
   }

   private float[] n5() {
      String var1 = "";
      if (this.l6().l6().y4().size() > 0) {
         var1 = this.l6().l6().y4().get_Item(0).l6();
      }

      return this.n5(var1, false);
   }

   private float[] c8() {
      String var1 = "";
      com.aspose.slides.internal.k4y.u9t var2 = null;
      if (this.l6().l6().y4().size() > 0) {
         var2 = this.l6().l6().y4().get_Item(0);
      }

      if (var2 != null && var2.a6() != null) {
         var1 = var2.a6().n5();
      }

      return this.n5(var1, true);
   }

   private float[] n5(String var1, boolean var2) {
      float[] var3 = new float[]{0.0F, 0.0F, 0.0F};
      if (!com.aspose.slides.ms.System.d1.n5(var1)) {
         IGenericEnumerator var4 = this.l6().l6().n5().iterator();

         try {
            while (var4.hasNext()) {
               KeyValuePair var5 = (KeyValuePair)var4.next();
               if (com.aspose.slides.ms.System.d1.a6(((com.aspose.slides.internal.k4y.j4k)var5.getValue()).l6(), var1)) {
                  double var6 = 720.0;
                  double var8 = 540.0;
                  if (((com.aspose.slides.internal.k4y.j4k)var5.getValue()).k5() != null) {
                     var6 = t2f.n5(((com.aspose.slides.internal.k4y.j4k)var5.getValue()).k5().n5(), var6);
                     var8 = t2f.n5(((com.aspose.slides.internal.k4y.j4k)var5.getValue()).k5().l6(), var8);
                  }

                  var3[0] = (float)var6;
                  var3[1] = (float)var8;
                  if (((com.aspose.slides.internal.k4y.j4k)var5.getValue()).k5() != null
                     && ((com.aspose.slides.internal.k4y.j4k)var5.getValue()).k5().k5() == 1) {
                     var3[2] = 1.0F;
                  }

                  return var3;
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
               var4.dispose();
            }
         }
      }

      var3[0] = var2 ? 595.25F : 793.75F;
      var3[1] = var2 ? 793.75F : 595.25F;
      var3[2] = var2 ? 1.0F : 0.0F;
      return var3;
   }

   private void l6(Presentation var1, com.aspose.slides.internal.k4y.t1g var2) {
      com.aspose.slides.internal.k4y.o5r var3 = var2.k5();
      com.aspose.slides.internal.k4y.e1u var4 = var2.l6();
      x0a var5 = new x0a(var4, this.k5(), "M");
      u9t var6 = new u9t(this.k5(), var2);
      IGenericEnumerator var7 = var1.getMasters().iterator();

      try {
         while (var7.hasNext()) {
            IMasterSlide var8 = (IMasterSlide)var7.next();
            MasterSlide var9 = (MasterSlide)var8;
            var5.l6().n5(var9);
            l1a.n5(var9, var3, var2, var6, var5);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var7, IDisposable.class)) {
            var7.dispose();
         }
      }

      if (var1.getMasterHandoutSlideManager().getMasterHandoutSlide() != null) {
         MasterHandoutSlide var13 = (MasterHandoutSlide)var1.getMasterHandoutSlideManager().getMasterHandoutSlide();
         var5.l6().n5(var13);
         m6v.n5(var13, var3, var6, var5);
      }
   }

   private IGenericList<KeyValuePair<com.aspose.slides.internal.k4y.u9t, IGenericList<com.aspose.slides.internal.k4y.u9t>>> t2() {
      IGenericList var1 = this.l6().l6().y4();
      if (l6(var1)) {
         return this.n5(var1);
      }

      com.aspose.slides.internal.k4y.u9t[] var2 = (com.aspose.slides.internal.k4y.u9t[])((List)var1).toArray(new com.aspose.slides.internal.k4y.u9t[0]);
      com.aspose.slides.internal.k4y.u9t[] var3 = new com.aspose.slides.internal.k4y.u9t[0];
      List var4 = new List();

      for (int var5 = 0; var5 < var2.length; var5++) {
         var4.add(new KeyValuePair<>(var2[var5], com.aspose.slides.ms.System.u3.n5(var3)));
      }

      return var4;
   }

   private IGenericList<KeyValuePair<com.aspose.slides.internal.k4y.u9t, IGenericList<com.aspose.slides.internal.k4y.u9t>>> n5(
      IGenericList<com.aspose.slides.internal.k4y.u9t> var1
   ) {
      List var2 = new List();
      Dictionary var3 = new Dictionary(var1.size());
      IGenericEnumerator var4 = var1.iterator();

      try {
         while (var4.hasNext()) {
            com.aspose.slides.internal.k4y.u9t var5 = (com.aspose.slides.internal.k4y.u9t)var4.next();
            com.aspose.slides.internal.r7c.u3 var6 = n5.l6(var5.n5());
            int var7 = com.aspose.slides.ms.System.a3.n5(var6.a6().n5(1).k5());
            IGenericList var8 = var3.containsKey(var7) ? (IGenericList)((KeyValuePair)var2.get_Item((Integer)var3.get_Item(var7))).getValue() : new List();
            if (!var3.containsKey(var7)) {
               var2.addItem(new KeyValuePair<>(var5, var8));
               var3.addItem(var7, var2.size() - 1);
            } else {
               var8.addItem(var5);
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      return var2;
   }

   private static boolean l6(IGenericList<com.aspose.slides.internal.k4y.u9t> var0) {
      IGenericEnumerator var1 = var0.iterator();

      try {
         while (var1.hasNext()) {
            com.aspose.slides.internal.k4y.u9t var2 = (com.aspose.slides.internal.k4y.u9t)var1.next();
            if (!n5.u3(var2.n5())) {
               return false;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var1, IDisposable.class)) {
            var1.dispose();
         }
      }

      return true;
   }
}
