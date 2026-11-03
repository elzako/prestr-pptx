package com.aspose.slides;

final class s6x {
   private short n5;
   private int l6;
   private float k5;
   private float u3;
   private float a6;
   private byte u9;
   private byte h0;
   private byte c8;
   private byte t2;
   private float s7;
   private float x8;
   private float n3;
   private float y4;
   private int e2;
   private boolean t9;
   private Cell z1;
   private com.aspose.slides.ms.System.o5<Boolean> t4 = new com.aspose.slides.ms.System.o5<>();
   private BulletFormat q0;
   private PortionFormat z3;
   private TabCollection m1;
   private n7w k7;
   private c6m m3;
   private r0g z8;
   private long j5;

   s6x(r0g var1, BulletFormat var2, PortionFormat var3, TabCollection var4, n7w var5, c6m var6) {
      this.n5 = -1;
      this.l6 = -1;
      this.k5 = Float.NaN;
      this.u3 = Float.NaN;
      this.a6 = Float.NaN;
      this.u9 = -1;
      this.h0 = -1;
      this.c8 = -1;
      this.t2 = -1;
      this.s7 = Float.NaN;
      this.x8 = Float.NaN;
      this.n3 = Float.NaN;
      this.y4 = Float.NaN;
      this.e2 = -1;
      this.z8 = var1;
      this.q0 = var2;
      this.z3 = var3;
      this.t4 = new com.aspose.slides.ms.System.o5<>(false);
      this.m1 = var4;
      this.k7 = var5;
      this.m3 = var6;
   }

   s6x(ParagraphFormat var1, r0g var2, BulletFormat var3, PortionFormat var4, TabCollection var5, n7w var6, c6m var7) {
      this(var2, var3, var4, var5, var6, var7);
      this.n5(var1);
   }

   public final IBulletFormat n5() {
      return this.q0;
   }

   public final short l6() {
      return this.n5 < 0 ? 0 : this.n5;
   }

   public final void n5(short var1) {
      if (var1 < 0) {
         var1 = 0;
      } else if (var1 > 9) {
         var1 = 9;
      }

      if (this.n5 != var1) {
         this.n5 = var1;
         this.w1();
      }
   }

   public final int k5() {
      return this.l6;
   }

   public final void n5(int var1) {
      if (this.l6 != var1) {
         this.l6 = var1;
         this.w1();
         this.t4 = new com.aspose.slides.ms.System.o5<>();
      }
   }

   public final float u3() {
      return this.k5;
   }

   public final void n5(float var1) {
      if (this.k5 != var1) {
         this.k5 = var1;
         this.w1();
      }
   }

   public final float a6() {
      return this.u3;
   }

   public final void l6(float var1) {
      if (this.u3 != var1) {
         this.u3 = var1;
         this.w1();
      }
   }

   public final float u9() {
      return this.a6;
   }

   public final void k5(float var1) {
      if (this.a6 != var1) {
         this.a6 = var1;
         this.w1();
      }
   }

   public final byte h0() {
      return this.u9;
   }

   public final void n5(byte var1) {
      if (this.u9 != var1) {
         this.u9 = var1;
         this.w1();
      }
   }

   public final byte c8() {
      return this.h0;
   }

   public final void l6(byte var1) {
      if (this.h0 != var1) {
         this.h0 = var1;
         this.w1();
      }
   }

   public final byte t2() {
      return this.c8;
   }

   public final void k5(byte var1) {
      if (this.c8 != var1) {
         this.c8 = var1;
         this.w1();
      }
   }

   public final byte s7() {
      return this.t2;
   }

   public final void u3(byte var1) {
      if (this.t2 != var1) {
         this.t2 = var1;
         this.w1();
      }
   }

   public final float x8() {
      return this.s7;
   }

   public final void u3(float var1) {
      if (this.s7 != var1) {
         this.s7 = var1;
         this.w1();
      }
   }

   public final float n3() {
      return this.x8;
   }

   public final void a6(float var1) {
      if (this.x8 != var1) {
         this.x8 = var1;
         this.w1();
      }
   }

   public final float y4() {
      return this.n3;
   }

   public final void u9(float var1) {
      if (this.n3 != var1) {
         this.n3 = var1;
         this.w1();
      }
   }

   public final float e2() {
      return this.y4;
   }

   public final void h0(float var1) {
      if (this.y4 != var1) {
         this.y4 = var1;
         this.w1();
      }
   }

   public final ITabCollection t9() {
      return this.m1;
   }

   public final int z1() {
      return this.e2;
   }

   public final void l6(int var1) {
      if (this.e2 != var1) {
         this.e2 = var1;
         this.w1();
      }
   }

   public final IPortionFormat t4() {
      return this.z3;
   }

   final TabCollection q0() {
      return this.m1;
   }

   final PortionFormat z3() {
      return this.z3;
   }

   final short m1() {
      return this.n5;
   }

   final void l6(short var1) {
      this.n5 = var1;
   }

   final Cell k7() {
      if (!this.t9) {
         Cell[] var1 = new Cell[]{this.z1};
         d0u.n5(Cell.class, this.z8, var1);
         this.z1 = var1[0];
         this.t9 = true;
      }

      return this.z1;
   }

   final boolean m3() {
      if (this.z3().n3()) {
         return true;
      }

      if (!this.t4.l6()) {
         this.t4 = new com.aspose.slides.ms.System.o5<>(false);
      }

      return this.t4.n5();
   }

   final void n5(ParagraphFormat var1) {
      this.q0.n5(var1.l6());
      this.n5 = var1.u9();
      this.l6 = var1.getAlignment();
      this.k5 = var1.getSpaceWithin();
      this.u3 = var1.getSpaceBefore();
      this.a6 = var1.getSpaceAfter();
      this.u9 = var1.getEastAsianLineBreak();
      this.h0 = var1.getRightToLeft();
      this.c8 = var1.getLatinLineBreak();
      this.t2 = var1.getHangingPunctuation();
      this.s7 = var1.getMarginLeft();
      this.x8 = var1.getMarginRight();
      this.n3 = var1.getIndent();
      this.y4 = var1.getDefaultTabSize();
      this.m1.n5((TabCollection)var1.getTabs());
      this.e2 = var1.getFontAlignment();
      this.z3.n5(var1.u3());
      this.m3.n5(var1.t2().n5());
      this.m3.n5(var1.t2().l6());
      this.k7.n5(var1.c8().n5());
      this.k7.l6(var1.c8().l6());
      this.w1();
   }

   final void n5(IParagraphFormat var1) {
      this.q0.l6((BulletFormat)var1.getBullet());
      this.z3.l6((PortionFormat)var1.getDefaultPortionFormat());
      if (((ParagraphFormat)var1).u9() != 0) {
         this.n5 = ((ParagraphFormat)var1).u9();
      }

      if (var1.getAlignment() != -1) {
         this.l6 = var1.getAlignment();
      }

      if (var1.getFontAlignment() != -1) {
         this.e2 = var1.getFontAlignment();
      }

      if (!com.aspose.slides.internal.n8e.v4.n5(var1.getSpaceWithin(), Float.NaN)) {
         this.k5 = var1.getSpaceWithin();
      }

      if (!com.aspose.slides.internal.n8e.v4.n5(var1.getSpaceBefore(), Float.NaN)) {
         this.u3 = var1.getSpaceBefore();
      }

      if (!com.aspose.slides.internal.n8e.v4.n5(var1.getSpaceAfter(), Float.NaN)) {
         this.a6 = var1.getSpaceAfter();
      }

      if (var1.getEastAsianLineBreak() != -1) {
         this.u9 = var1.getEastAsianLineBreak();
      }

      if (var1.getRightToLeft() != -1) {
         this.h0 = var1.getRightToLeft();
      }

      if (var1.getLatinLineBreak() != -1) {
         this.c8 = var1.getLatinLineBreak();
      }

      if (var1.getHangingPunctuation() != -1) {
         this.t2 = var1.getHangingPunctuation();
      }

      if (!com.aspose.slides.internal.n8e.v4.n5(var1.getMarginLeft(), Float.NaN)) {
         this.s7 = var1.getMarginLeft();
      }

      if (!com.aspose.slides.internal.n8e.v4.n5(var1.getMarginRight(), Float.NaN)) {
         this.x8 = var1.getMarginRight();
      }

      if (!com.aspose.slides.internal.n8e.v4.n5(var1.getIndent(), Float.NaN)) {
         this.n3 = var1.getIndent();
      }

      if (!com.aspose.slides.internal.n8e.v4.n5(var1.getDefaultTabSize(), Float.NaN)) {
         this.y4 = var1.getDefaultTabSize();
      }

      if (((TabCollection)var1.getTabs()).size() != 0) {
         this.m1.n5((TabCollection)var1.getTabs());
      }

      if (((ParagraphFormat)var1).t2().n5()) {
         this.m3.n5(((ParagraphFormat)var1).t2().n5());
      }

      if (((ParagraphFormat)var1).t2().l6() != null) {
         this.m3.n5(((ParagraphFormat)var1).t2().l6());
      }

      if (((ParagraphFormat)var1).c8().n5()) {
         this.k7.n5(((ParagraphFormat)var1).c8().n5());
      }

      if (((ParagraphFormat)var1).c8().l6()) {
         this.k7.l6(((ParagraphFormat)var1).c8().l6());
      }

      this.w1();
   }

   final void n5(t3x var1) {
      this.q0.n5(var1.k5);
      this.n5 = var1.getDepth();
      this.l6 = var1.a6;
      this.k5 = var1.u9;
      this.u3 = var1.h0;
      this.a6 = var1.c8;
      this.u9 = var1.t2;
      this.h0 = var1.s7;
      this.c8 = var1.x8;
      this.t2 = var1.n3;
      this.s7 = var1.y4;
      this.x8 = var1.e2;
      this.n3 = var1.t9;
      this.y4 = var1.z1;
      this.m1.clear();

      for (int var2 = 0; var2 < var1.t4.size(); var2++) {
         k8b var3 = var1.t4.getValues().get_Item(var2);
         this.m1.add(new Tab(var3.getPosition(), var3.getAlignment()));
      }

      this.e2 = var1.q0;
      this.z3.n5(var1.z3);
      this.w1();
   }

   final boolean l6(IParagraphFormat var1) {
      return this.q0.n5(var1.getBullet())
         && this.n5 == ((ParagraphFormat)var1).u9()
         && this.l6 == var1.getAlignment()
         && com.aspose.slides.internal.n8e.v4.n5(this.k5, var1.getSpaceWithin())
         && com.aspose.slides.internal.n8e.v4.n5(this.u3, var1.getSpaceBefore())
         && com.aspose.slides.internal.n8e.v4.n5(this.a6, var1.getSpaceAfter())
         && this.u9 == var1.getEastAsianLineBreak()
         && this.h0 == var1.getRightToLeft()
         && this.c8 == var1.getLatinLineBreak()
         && this.t2 == var1.getHangingPunctuation()
         && com.aspose.slides.internal.n8e.v4.n5(this.s7, var1.getMarginLeft())
         && com.aspose.slides.internal.n8e.v4.n5(this.x8, var1.getMarginRight())
         && com.aspose.slides.internal.n8e.v4.n5(this.n3, var1.getIndent())
         && com.aspose.slides.internal.n8e.v4.n5(this.y4, var1.getDefaultTabSize())
         && this.m1.equals(var1.getTabs())
         && this.e2 == var1.getFontAlignment()
         && this.z3.equals(var1.getDefaultPortionFormat());
   }

   final boolean z8() {
      return this.l6 == -1
         && com.aspose.slides.internal.n8e.v4.n5(this.k5, Float.NaN)
         && com.aspose.slides.internal.n8e.v4.n5(this.u3, Float.NaN)
         && com.aspose.slides.internal.n8e.v4.n5(this.a6, Float.NaN)
         && this.u9 == -1
         && this.h0 == -1
         && this.c8 == -1
         && this.t2 == -1
         && com.aspose.slides.internal.n8e.v4.n5(this.s7, Float.NaN)
         && com.aspose.slides.internal.n8e.v4.n5(this.x8, Float.NaN)
         && com.aspose.slides.internal.n8e.v4.n5(this.n3, Float.NaN)
         && com.aspose.slides.internal.n8e.v4.n5(this.y4, Float.NaN)
         && this.m1.size() == 0
         && this.e2 == -1;
   }

   final void l6(ParagraphFormat var1) {
      this.q0.l6((IBulletFormat)var1.l6());
      if (this.n5 != -1) {
         var1.n5(this.n5);
      }

      if (this.l6 != -1) {
         var1.setAlignment(this.l6);
      }

      if (!com.aspose.slides.ms.System.n1.k5(this.k5)) {
         var1.setSpaceWithin(this.k5);
      }

      if (!com.aspose.slides.ms.System.n1.k5(this.u3)) {
         var1.setSpaceBefore(this.u3);
      }

      if (!com.aspose.slides.ms.System.n1.k5(this.a6)) {
         var1.setSpaceAfter(this.a6);
      }

      if (this.u9 != -1) {
         var1.setEastAsianLineBreak(this.u9);
      }

      if (this.h0 != -1) {
         var1.setRightToLeft(this.h0);
      }

      if (this.c8 != -1) {
         var1.setLatinLineBreak(this.c8);
      }

      if (this.t2 != -1) {
         var1.setHangingPunctuation(this.t2);
      }

      if (!com.aspose.slides.ms.System.n1.k5(this.s7)) {
         var1.setMarginLeft(this.s7);
      }

      if (!com.aspose.slides.ms.System.n1.k5(this.x8)) {
         var1.setMarginRight(this.x8);
      }

      if (!com.aspose.slides.ms.System.n1.k5(this.n3)) {
         var1.setIndent(this.n3);
      }

      if (!com.aspose.slides.ms.System.n1.k5(this.y4)) {
         var1.setDefaultTabSize(this.y4);
      }

      for (int var2 = 0; var2 < this.m1.size(); var2++) {
         var1.getTabs().add(new Tab(this.m1.get_Item(var2).getPosition(), this.m1.get_Item(var2).getAlignment()));
      }

      if (this.e2 != -1) {
         var1.setFontAlignment(this.e2);
      }

      this.z3.n5(var1.u3());
   }

   final void k5(ParagraphFormat var1) {
      this.q0.k5(var1.l6());
      if (this.n5 == -1) {
         this.n5 = var1.u9();
      }

      if (this.l6 == -1) {
         this.l6 = var1.getAlignment();
      }

      if (com.aspose.slides.ms.System.n1.k5(this.k5)) {
         this.k5 = var1.getSpaceWithin();
      }

      if (com.aspose.slides.ms.System.n1.k5(this.u3)) {
         this.u3 = var1.getSpaceBefore();
      }

      if (com.aspose.slides.ms.System.n1.k5(this.a6)) {
         this.a6 = var1.getSpaceAfter();
      }

      if (this.u9 == -1) {
         this.u9 = var1.getEastAsianLineBreak();
      }

      if (this.h0 == -1) {
         this.h0 = var1.getRightToLeft();
      }

      if (this.c8 == -1) {
         this.c8 = var1.getLatinLineBreak();
      }

      if (this.t2 == -1) {
         this.t2 = var1.getHangingPunctuation();
      }

      if (com.aspose.slides.ms.System.n1.k5(this.s7)) {
         this.s7 = var1.getMarginLeft();
      }

      if (com.aspose.slides.ms.System.n1.k5(this.x8)) {
         this.x8 = var1.getMarginRight();
      }

      if (com.aspose.slides.ms.System.n1.k5(this.n3)) {
         this.n3 = var1.getIndent();
      }

      if (com.aspose.slides.ms.System.n1.k5(this.y4)) {
         this.y4 = var1.getDefaultTabSize();
      }

      for (int var2 = 0; var2 < var1.x8(); var2++) {
         this.m1.add(new Tab(var1.getTabs().get_Item(var2).getPosition(), var1.getTabs().get_Item(var2).getAlignment()));
      }

      if (this.e2 == -1) {
         this.e2 = var1.getFontAlignment();
      }

      this.z3.l6(var1.u3());
      this.m3.n5(var1.t2().n5());
      this.m3.n5(var1.t2().l6());
      this.k7.n5(var1.c8().n5());
      this.k7.l6(var1.c8().l6());
   }

   final long j5() {
      return (
               (
                        (((this.j5 & 4294967295L) + (this.m1.l6() & 4294967295L) & 4294967295L) + (this.z3.getVersion() & 4294967295L) & 4294967295L)
                              + (this.q0.getVersion() & 4294967295L)
                           & 4294967295L
                     )
                     + (this.m3.k5() & 4294967295L)
                  & 4294967295L
            )
            + ((this.k7() != null ? this.k7().k5().x8().getVersion() : 0L) & 4294967295L)
         & 4294967295L;
   }

   private void w1() {
      this.j5++;
   }

   @Override
   public boolean equals(Object obj) {
      ParagraphFormat var2 = com.aspose.slides.internal.v6g.k5.n5(obj, ParagraphFormat.class);
      if (var2 == null) {
         return false;
      } else {
         return this.k7.n5() != var2.c8().n5() || this.k7.l6() != var2.c8().l6() || this.m3.n5() != var2.t2().n5()
            ? false
            : com.aspose.slides.internal.n8e.v4.n5((float)(this.l6()), (float)(var2.u9()))
               && com.aspose.slides.internal.n8e.v4.n5((float)(this.k5()), (float)(var2.getAlignment()))
               && com.aspose.slides.internal.n8e.v4.n5(this.u9(), var2.getSpaceAfter())
               && com.aspose.slides.internal.n8e.v4.n5(this.a6(), var2.getSpaceBefore())
               && com.aspose.slides.internal.n8e.v4.n5(this.u3(), var2.getSpaceWithin())
               && com.aspose.slides.internal.n8e.v4.n5((float)(this.h0()), (float)(var2.getEastAsianLineBreak()))
               && com.aspose.slides.internal.n8e.v4.n5((float)(this.c8()), (float)(var2.getRightToLeft()))
               && com.aspose.slides.internal.n8e.v4.n5((float)(this.t2()), (float)(var2.getLatinLineBreak()))
               && com.aspose.slides.internal.n8e.v4.n5((float)(this.s7()), (float)(var2.getHangingPunctuation()))
               && com.aspose.slides.internal.n8e.v4.n5(this.x8(), var2.getMarginLeft())
               && com.aspose.slides.internal.n8e.v4.n5(this.n3(), var2.getMarginRight())
               && com.aspose.slides.internal.n8e.v4.n5(this.y4(), var2.getIndent())
               && com.aspose.slides.internal.n8e.v4.n5(this.e2(), var2.getDefaultTabSize())
               && com.aspose.slides.internal.n8e.v4.n5((float)(this.z1()), (float)(var2.getFontAlignment()))
               && com.aspose.slides.internal.n8e.v4.n5((float)(this.t9().size()), (float)(var2.getTabs().size()))
               && com.aspose.slides.internal.n8e.v4.n5(this.n5(), var2.l6())
               && com.aspose.slides.internal.n8e.v4.n5(this.t4(), var2.u3());
      }
   }

   @Override
   public int hashCode() {
      return super.hashCode();
   }
}
