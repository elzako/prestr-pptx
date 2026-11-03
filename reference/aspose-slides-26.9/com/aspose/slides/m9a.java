package com.aspose.slides;

final class m9a {
   private boolean n5;
   private String l6;
   private boolean k5;
   private int u3;
   private boolean a6;
   private boolean u9;
   private boolean h0;
   private boolean c8;
   private boolean t2;
   private boolean s7;
   private boolean x8;
   private String n3;
   private boolean y4;
   private boolean e2;
   private final Format t9;
   private final ChartTextFormat z1;
   private final r0g t4;
   private long q0;

   m9a(r0g var1, Format var2, ChartTextFormat var3) {
      this.t4 = var1;
      this.t9 = var2;
      this.z1 = var3;
      this.n5 = false;
      this.l6 = "";
      this.k5 = true;
      this.u3 = -1;
      this.a6 = false;
      this.u9 = false;
      this.h0 = false;
      this.c8 = false;
      this.t2 = false;
      this.s7 = false;
      this.x8 = false;
      this.n3 = "";
      this.y4 = false;
      this.e2 = false;
   }

   final void n5(DataLabelFormat var1) {
      this.t9.n5(var1.getFormat());
      this.n5(var1.isNumberFormatLinkedToSource());
      this.l6 = var1.getNumberFormat();
      this.u3 = var1.getPosition();
      this.n3 = var1.getSeparator();
      this.s7 = var1.getShowBubbleSize();
      this.h0 = var1.getShowCategoryName();
      this.a6 = var1.getShowLegendKey();
      this.t2 = var1.getShowPercentage();
      this.c8 = var1.getShowSeriesName();
      this.u9 = var1.getShowValue();
      TextFrame var2 = new TextFrame((DataLabel)this.t4);
      var1.getTextFormat().copyTo(var2);
      this.z1.copyFrom(var2);
   }

   public final boolean n5() {
      return this.k5;
   }

   public final void n5(boolean var1) {
      this.k5 = var1;
      this.z1();
   }

   public final String l6() {
      return this.l6;
   }

   public final void n5(String var1) {
      this.l6 = var1;
      this.z1();
   }

   public final int k5() {
      return this.u3;
   }

   public final void n5(int var1) {
      this.u3 = var1;
      this.z1();
   }

   public final boolean u3() {
      return this.a6;
   }

   public final void l6(boolean var1) {
      this.a6 = var1;
      this.z1();
   }

   public final boolean a6() {
      return this.u9;
   }

   public final void k5(boolean var1) {
      this.u9 = var1;
      this.z1();
   }

   public final boolean u9() {
      return this.h0;
   }

   public final void u3(boolean var1) {
      this.h0 = var1;
      this.z1();
   }

   public final boolean h0() {
      return this.c8;
   }

   public final void a6(boolean var1) {
      this.c8 = var1;
      this.z1();
   }

   public final boolean c8() {
      return this.t2;
   }

   public final void u9(boolean var1) {
      this.t2 = var1;
      this.z1();
   }

   public final boolean t2() {
      return this.s7;
   }

   public final void h0(boolean var1) {
      this.s7 = var1;
      this.z1();
   }

   public final boolean s7() {
      return this.x8;
   }

   public final void c8(boolean var1) {
      this.x8 = var1;
      this.z1();
   }

   public final String x8() {
      return this.n3;
   }

   public final void l6(String var1) {
      this.n3 = var1;
      this.z1();
   }

   public final boolean n3() {
      return this.y4;
   }

   public final void t2(boolean var1) {
      this.y4 = var1;
      this.z1();
   }

   public final boolean y4() {
      return this.e2;
   }

   public final void s7(boolean var1) {
      this.e2 = var1;
      this.z1();
   }

   final boolean e2() {
      return this.n5;
   }

   final void x8(boolean var1) {
      this.n5 = var1;
   }

   final long t9() {
      return ((this.q0 & 4294967295L) + (this.t9.getVersion() & 4294967295L) & 4294967295L) + (this.z1.n5() & 4294967295L) & 4294967295L;
   }

   private void z1() {
      this.q0++;
   }
}
