package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;

class t3r {
   private final TextFrame n5;
   private m4i l6;
   private List<r1f> k5;
   private int u3;

   public final m4i n5() {
      return this.l6;
   }

   public final void n5(m4i var1) {
      this.l6 = var1;
   }

   public final List<r1f> l6() {
      return this.k5;
   }

   public final void n5(List<r1f> var1) {
      this.k5 = var1;
   }

   public final int k5() {
      return this.u3;
   }

   public final void n5(int var1) {
      this.u3 = var1;
   }

   public t3r(TextFrame var1, e2n var2, m4i var3) {
      this.n5(var3);
      this.n5 = var1;
      if (com.aspose.slides.internal.v6g.k5.l6(var3.k5, MathPortion.class) && n6p.n5(var1)) {
         this.n5(this.n5(var2, var3));
         this.n5(this.l6().size());
      } else {
         this.n5(var3.l6.length());
      }
   }

   private List<r1f> n5(e2n var1, m4i var2) {
      w7c var3 = new w7c((BaseSlide)this.n5.getSlide(), ((Presentation)this.n5.getSlide().getPresentation()).a6(), this.n5, new d2k());
      x5n var4 = new x5n(var1, var3, this.n5, var2);
      return var4.l6();
   }
}
