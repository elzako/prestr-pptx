package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.ms.System.IDisposable;

class n8 extends x0q {
   private i1x n5;
   private n4i l6;

   public final i1x n5() {
      return this.n5;
   }

   public final n4i l6() {
      return this.l6;
   }

   public n8(com.aspose.slides.internal.c8m.j8 var1, t5w var2) {
      super(var1, var2);
      this.n5 = new i1x(var2, this.t9());
   }

   public n8(com.aspose.slides.internal.c8m.j8 var1, g6c var2, IBaseSlide var3) {
      super(var1, var2);
      this.l6 = new n4i(var3, var2, this.t9());
      o8 var4 = ((BaseSlide)var3).k5();
      l1x var5 = ((Presentation)var2.t2()).n3();
      d3o.n5(var1, var5.z3(), var4.h0());
   }

   protected final void n5(IMasterThemeManager var1) {
      var1.setOverrideThemeEnabled(false);
      v6p var2 = this.z1();
      if (var2 != null) {
         var2.n5(var1);
      }
   }

   protected final void l6(IMasterThemeManager var1) {
      v6p var2 = this.z1();
      if (var2 != null) {
         var2.l6(var1);
      }
   }

   final void n5(IShapeCollection var1, n4i var2) {
      IGenericEnumerator var3 = var1.iterator();

      try {
         while (var3.hasNext()) {
            IShape var4 = (IShape)var3.next();
            Shape var5 = (Shape)var4;
            if (!var5.d2()) {
               var2.n5(var5, var5.h0().z3());
            }

            if (com.aspose.slides.internal.v6g.k5.l6(var5, IGroupShape.class)) {
               this.n5(((IGroupShape)var5).getShapes(), var2);
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }
   }

   private v6p z1() {
      com.aspose.slides.internal.c8m.r7[] var1 = this.k5().k7().n5(com.aspose.slides.internal.c8m.j1.n5);
      return var1.length > 0 ? new v6p(var1[0].l6(), this.k5()) : null;
   }
}
