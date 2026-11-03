package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentNullException;

class u9t extends o9a {
   private int n5;
   private final com.aspose.slides.internal.k4y.t1g l6;
   private final OdpSerializationContext k5;

   public u9t(OdpSerializationContext var1, com.aspose.slides.internal.k4y.t1g var2) {
      if (var2 == null) {
         throw new ArgumentNullException("documentStylesElementData");
      }

      this.k5 = var1;
      this.l6 = var2;
      if (this.n5().a6() == null) {
         this.n5().l6();
      }

      this.x8();
   }

   private void x8() {
      com.aspose.slides.internal.k4y.j4k var1 = (com.aspose.slides.internal.k4y.j4k)this.h0().n5("page-layout").l6();
      com.aspose.slides.internal.k4y.c1h var2 = var1.n5();
      com.aspose.slides.internal.k4y.j4k var3 = (com.aspose.slides.internal.k4y.j4k)this.h0().n5("page-layout").l6();
      com.aspose.slides.internal.k4y.c1h var4 = var3.n5();
      var1.n5("pageLayout1");
      var3.n5("pageLayout3");
      var2.n5(2);
      var4.n5(1);
      ISlideSize var5 = this.l6().n5().getSlideSize();
      if (var5.getOrientation() == 0) {
         var2.n5(t2f.n5(var5.getSize().getWidth()));
         var2.l6(t2f.n5(var5.getSize().getHeight()));
         var4.n5(t2f.n5(var5.getSize().getHeight()));
         var4.l6(t2f.n5(var5.getSize().getWidth()));
      } else {
         var4.n5(t2f.n5(var5.getSize().getWidth()));
         var4.l6(t2f.n5(var5.getSize().getHeight()));
         var2.n5(t2f.n5(var5.getSize().getHeight()));
         var2.l6(t2f.n5(var5.getSize().getWidth()));
      }

      com.aspose.slides.internal.k4y.j4k var6 = (com.aspose.slides.internal.k4y.j4k)this.h0().n5("page-layout").l6();
      com.aspose.slides.internal.k4y.c1h var7 = var6.n5();
      var6.n5("noteLayout1");
      var7.n5(1);
      INotesSize var8 = this.l6().n5().getNotesSize();
      var7.n5(t2f.n5(var8.getSize().getWidth()));
      var7.l6(t2f.n5(var8.getSize().getHeight()));
      this.a6().set_Item("pageLayout1", var1);
      this.a6().set_Item("pageLayout3", var3);
      this.a6().set_Item("noteLayout1", var6);
   }

   public final com.aspose.slides.internal.k4y.t1g n5() {
      return this.l6;
   }

   public final OdpSerializationContext l6() {
      return this.k5;
   }

   public final com.aspose.slides.internal.k4y.y2i u9() {
      com.aspose.slides.internal.k4y.y2i var1 = (com.aspose.slides.internal.k4y.y2i)this.h0().n5("style").l6();
      var1.l6(com.aspose.slides.ms.System.d1.n5("{0}{1}",new Object[]{ "gp", this.t2()}));
      var1.n5(11);
      this.k5().set_Item(var1.n5(), var1);
      return var1;
   }

   protected final com.aspose.slides.internal.k4y.e1u h0() {
      return this.n5().a6();
   }

   public final String c8() {
      if (!com.aspose.slides.internal.v6g.k5.l6(this.k5.c8(), MasterHandoutSlide.class)
         && !com.aspose.slides.internal.v6g.k5.l6(this.k5.c8(), MasterNotesSlide.class)) {
         return this.k5.n5().getSlideSize().getOrientation() == 0 ? "pageLayout1" : "pageLayout3";
      } else {
         return "noteLayout1";
      }
   }

   public final int t2() {
      return this.n5().u3() == null ? 0 : this.n5().u3().n5().size() + (this.n5().a6() == null ? 0 : this.n5().a6().n5().size());
   }

   public final int s7() {
      return ++this.n5;
   }
}
