package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.ms.System.IDisposable;

public class SmartArt extends GraphicalObject implements ISmartArt {
   private SmartArtNode n5;
   private v8v l6;
   private t6w k5;
   private o1o u3;
   private long a6;

   @Override
   public final ISmartArtNodeCollection getAllNodes() {
      SmartArtNodeCollection var1 = new SmartArtNodeCollection(this.n5);
      var1.n5();
      return var1;
   }

   @Override
   public final ISmartArtNodeCollection getNodes() {
      return this.n5.getChildNodes();
   }

   @Override
   public final int getLayout() {
      return h5h.n5(this.j5().h0());
   }

   @Override
   public final void setLayout(int value) {
      if (value == 134) {
         throw new ArgumentException("Layout template for SmartArtLayoutType.Custom does not exist.");
      }

      if (this.getLayout() != value) {
         z9c.l6(this, value);
         com.aspose.slides.internal.k4y.v3 var2 = this.u9().u3();
         this.j5().u3(var2.n5());
         this.j5().a6(var2.l6().n5()[0].n5());
         this.x8();
      }
   }

   @Override
   public final int getQuickStyle() {
      return x9u.n5(this.j5().c8());
   }

   @Override
   public final void setQuickStyle(int value) {
      if (this.getQuickStyle() != value) {
         z9c.k5(this, value);
         com.aspose.slides.internal.k4y.q6 var2 = this.u9().a6();
         this.j5().u9(var2.n5());
         this.j5().h0(var2.l6().n5()[0].n5());
         this.x8();
      }
   }

   @Override
   public final int getColorStyle() {
      return e6d.n5(this.j5().t2());
   }

   @Override
   public final void setColorStyle(int value) {
      if (this.getColorStyle() != value) {
         z9c.u3(this, value);
         com.aspose.slides.internal.k4y.y1 var2 = this.u9().n5();
         this.j5().c8(var2.n5());
         this.j5().t2(var2.l6().n5()[0].n5());
         this.x8();
      }
   }

   @Override
   public final boolean isReversed() {
      return this.n5.u9();
   }

   @Override
   public final void setReversed(boolean value) {
      if (this.isReversed() != value) {
         this.n5.n5(value);
         this.x8();
      }
   }

   final h5t n5() {
      return (h5t)super.e5();
   }

   SmartArt(r0g parentImmediate) {
      super(parentImmediate, new d2c());
      this.m3();
      this.n5(new h5t(this));
   }

   SmartArt(r0g parentImmediate, IPresentation presentation, int layoutType) {
      super(parentImmediate, new d2c());
      this.m3();
      z9c.n5(this, layoutType);
      z9c.l6(this, layoutType);
      z9c.k5(this, 0);
      z9c.u3(this, 9);
      t5w var4 = new t5w(presentation, InterruptionToken.getNone());
      this.k5(var4);
      this.u3(var4);
      this.n5(new h5t(this));
   }

   private void m3() {
      this.u9().n5(new GroupShape(this));
      this.t2 = new LineFormat(this);
   }

   @Override
   void s7() {
      super.s7();
      this.n5(((Slide)this.j9()).w1().l6(this.getPlaceholder().getIndex()).p8());
      this.n5().n5(this.i1());
   }

   final String k5() {
      String var1 = this.j5().h0();
      if (var1 == null) {
         var1 = com.aspose.slides.ms.System.d1.n5;
      }

      return var1;
   }

   final d2c u9() {
      return (d2c)super.t4();
   }

   final void n5(t5w var1) {
      this.k5(var1);
      this.u3(var1);
      this.e2();
   }

   final void n5(g6c var1) {
      if (this.u9().l6().h0() == null) {
         this.u9().l6().l6();
      }

      com.aspose.slides.internal.k4y.w6 var2 = this.u9().l6().h0();
      if (var2.n5() == null) {
         x9f.n5(this.c8, new SmartArt$1(this, var2), var1);
      }

      if (var2.l6() == null) {
         w5i.n5(this.y1(), new SmartArt$2(this, var2), var1);
      }

      if (this.u9().l6().c8() == null) {
         this.u9().l6().k5();
      }

      if (this.u9().l6().c8().l6() == null) {
         i3z.n5(this.y2(), new SmartArt$3(this));
      }

      this.n5.n5().l6().n5((IThreeDFormat)this.r4());
      this.z8();
      IGenericEnumerator var3 = this.u3.iterator();

      try {
         while (var3.hasNext()) {
            w4c var4 = (w4c)var3.next();
            var4.n5(var1);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }
   }

   final w4c n5(String var1, String var2) {
      return this.u3.n5(var1, var2);
   }

   final void x8() {
      this.l6(new t5w(this.getPresentation(), InterruptionToken.getNone()));
   }

   final void l6(t5w var1) {
      this.u9().h0().getShapes().clear();
      this.z8();
      this.u3(var1);
      this.n5().k5(false);
   }

   @Override
   void n5(float var1, float var2, float var3) {
      super.n5((float)var1, var2, var3);
      this.x8();
   }

   private void z8() {
      SmartArtNodeCollection var1 = (SmartArtNodeCollection)this.getAllNodes();
      IGenericEnumerator var2 = var1.iterator();

      try {
         while (var2.hasNext()) {
            SmartArtNode var3 = (SmartArtNode)var2.next();
            IGenericEnumerator var4 = var3.getShapes().iterator();

            try {
               while (var4.hasNext()) {
                  SmartArtShape var5 = (SmartArtShape)var4.next();
                  var5.n5();
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
   }

   private void k5(t5w var1) {
      com.aspose.slides.internal.k4y.i1 var2 = this.u9().l6();
      this.u3 = new o1o(var2.a6(), this, var1);
      this.k5 = new t6w(var2.u9());
      this.n5 = new SmartArtNode(null, this);
      this.n5.n5(this.u3.n5(null, 3));
      this.r4().n5((IThreeDFormat)this.n5.n5().l6());
      this.u9().n5(w4c.n5(this.n5.n5()));
      this.n5(this.n5, this.n5.n5());
   }

   private void n5(SmartArtNode var1, w4c var2) {
      List var3 = new List();
      IGenericEnumerator var4 = this.k5.iterator();

      try {
         while (var4.hasNext()) {
            q9r var5 = (q9r)var4.next();
            if (com.aspose.slides.ms.System.d1.a6(var5.k5(), var2.u3()) && var5.n5() == 1) {
               var3.addItem(var5);
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      var3.sort();
      List$Enumerator var18 = var3.iterator();

      try {
         while (var18.hasNext()) {
            q9r var6 = (q9r)var18.next();
            w4c var7 = this.u3.n5(var6.l6(), 1);
            if (var7 == null) {
               var7 = this.u3.n5(var6.l6(), 2);
            }

            w4c var8 = this.u3.n5(var6.a6(), 5);
            w4c var9 = this.u3.n5(var6.u9(), 6);
            SmartArtNode var10 = ((SmartArtNodeCollection)var1.getChildNodes()).n5(var7, var8, var9);
            this.n5(var10, var7);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var18, IDisposable.class)) {
            var18.dispose();
         }
      }
   }

   private void u3(t5w var1) {
      com.aspose.slides.internal.k4y.i1 var2 = new com.aspose.slides.internal.k4y.i1();
      var2.n5();
      o1o var3 = new o1o(var2.a6(), this, var1);
      t6w var4 = new t6w(var2.u9());
      l6s var5 = new l6s(null, this.n5);
      var5.n5(var3);
      var5.n5(var4);
      this.l6 = new v8v(this, this.u9().u3().k5(), var5);
      this.l6.n5(var3);
      this.l6.n5(var4);
      this.l6.n5(this.n5);
      this.u9().n5(var2);
      this.k5 = var4;
      this.u3 = var3;
   }

   private com.aspose.slides.internal.k4y.a6w j5() {
      return this.u9().c8().h0();
   }

   final v8v y4() {
      return this.l6;
   }

   final boolean e2() {
      boolean var1 = this.u9().u9() != null && this.u9().h0().getShapes().size() != 0;
      if (var1 && (this.t2() & 4294967295L) == (this.a6 & 4294967295L)) {
         IShapeCollection var2 = this.u9().h0().getShapes();
         IGenericEnumerator var3 = var2.iterator();

         try {
            while (var3.hasNext()) {
               IShape var4 = (IShape)var3.next();
               AutoShape var5 = com.aspose.slides.internal.v6g.k5.n5(var4, AutoShape.class);
               k6a var6 = this.l6.n5(var5.n5().u9());
               if (var6 != null) {
                  TextFrame var7 = var5.l6();
                  if (var7 != null) {
                     if (!com.aspose.slides.ms.System.n1.k5(var7.s7().getRotationAngle())) {
                        return false;
                     }

                     String var8 = com.aspose.slides.ms.System.d1.n5(com.aspose.slides.ms.System.d1.n5(var7.t2(), "\r", ""), "\n", "");
                     String var9 = com.aspose.slides.ms.System.d1.n5;
                     List$Enumerator var10 = var6.u9().iterator();

                     try {
                        while (var10.hasNext()) {
                           l6s var11 = (l6s)var10.next();
                           var9 = com.aspose.slides.ms.System.d1.n5(
                              var9, com.aspose.slides.ms.System.d1.n5(com.aspose.slides.ms.System.d1.n5(var11.k5(), "\r", ""), "\n", "")
                           );
                        }
                     } finally {
                        if (com.aspose.slides.internal.v6g.k5.n5(var10, IDisposable.class)) {
                           var10.dispose();
                        }
                     }

                     if (!com.aspose.slides.ms.System.d1.a6(var9, var8)) {
                        return false;
                     }
                  }
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
               var3.dispose();
            }
         }

         IGenericEnumerator var75 = var2.iterator();

         try {
            while (var75.hasNext()) {
               IShape var76 = (IShape)var75.next();
               AutoShape var78 = com.aspose.slides.internal.v6g.k5.n5(var76, AutoShape.class);
               k6a var80 = this.l6.n5(var78.n5().u9());
               if (var80 != null) {
                  var80.c8().n5(var78);
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var75, IDisposable.class)) {
               var75.dispose();
            }
         }

         this.l6.u9();
         ISmartArtNodeCollection var77 = this.getAllNodes();
         IGenericEnumerator var79 = var77.iterator();

         try {
            while (var79.hasNext()) {
               SmartArtNode var81 = (SmartArtNode)var79.next();
               if (var81.n5().h0()) {
                  return false;
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var79, IDisposable.class)) {
               var79.dispose();
            }
         }

         this.l6.h0();
         IGenericEnumerator var82 = var2.iterator();

         try {
            while (var82.hasNext()) {
               IShape var83 = (IShape)var82.next();
               AutoShape var84 = com.aspose.slides.internal.v6g.k5.n5(var83, AutoShape.class);
               k6a var85 = this.l6.n5(var84.n5().u9());
               if (var85 != null) {
                  var85.c8().n5(var84);
                  if (var84.getTextFrame() != null) {
                     IGenericEnumerator var86 = var84.getTextFrame().getParagraphs().iterator();

                     try {
                        while (var86.hasNext()) {
                           Paragraph var12 = (Paragraph)var86.next();
                           IGenericEnumerator var13 = var12.getPortions().iterator();

                           try {
                              while (var13.hasNext()) {
                                 Portion var14 = (Portion)var13.next();
                                 if (var14.getPortionFormat().getFontHeight() < var14.getPortionFormat().getKerningMinimalSize()) {
                                    var14.getPortionFormat().setFontHeight(var14.getPortionFormat().getFontHeight() + 0.1F);
                                 }
                              }
                           } finally {
                              if (com.aspose.slides.internal.v6g.k5.n5(var13, IDisposable.class)) {
                                 var13.dispose();
                              }
                           }
                        }
                     } finally {
                        if (com.aspose.slides.internal.v6g.k5.n5(var86, IDisposable.class)) {
                           var86.dispose();
                        }
                     }
                  }
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var82, IDisposable.class)) {
               var82.dispose();
            }
         }

         return true;
      } else {
         return false;
      }
   }

   final void z1() {
      this.a6 = this.t2();
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   d2c t4() {
      return this.u9();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   d2c h0() {
      return this.u9();
   }

}
