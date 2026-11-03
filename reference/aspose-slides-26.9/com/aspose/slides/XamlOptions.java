package com.aspose.slides;

public class XamlOptions extends SaveOptions implements IXamlOptions {
   private String n5;
   private String l6 = "";
   private String k5 = "Slide";
   private boolean u3;
   private IXamlOutputSaver a6;
   private boolean u9;
   private com.aspose.slides.internal.o9b.f2 h0 = new com.aspose.slides.internal.o9b.f2();
   private int c8;
   private String t2;
   private String s7;
   private boolean x8;
   private int n3;
   private e5n y4;
   private e5n e2;
   private e5n t9;
   private e5n z1;
   private e5n t4;
   private e5n q0;

   public XamlOptions() {
      this.l6(1);
      this.n5(1);
      this.setOutputSaver(new k5e());
      this.n5(new y2c());
      this.l6(new e0l());
      this.k5(new y2c());
      this.u3(new e0l());
      this.a6(new y2c());
      this.u9(new e0l());
   }

   @Override
   public final boolean getExportHiddenSlides() {
      return this.u3;
   }

   @Override
   public final void setExportHiddenSlides(boolean value) {
      this.u3 = value;
   }

   @Override
   public final IXamlOutputSaver getOutputSaver() {
      return this.a6;
   }

   @Override
   public final void setOutputSaver(IXamlOutputSaver value) {
      this.a6 = value;
   }

   final boolean n5() {
      return this.u9;
   }

   final com.aspose.slides.internal.o9b.f2 l6() {
      return this.h0.a6();
   }

   final void n5(com.aspose.slides.internal.o9b.f2 var1) {
      this.h0 = var1.a6();
   }

   final String k5() {
      return !com.aspose.slides.ms.System.d1.n5(this.n5) ? this.n5 : this.u9();
   }

   final int u3() {
      return this.c8;
   }

   final void n5(int var1) {
      this.c8 = var1;
   }

   final String a6() {
      return this.t2;
   }

   final String u9() {
      return this.s7;
   }

   final String h0() {
      return this.k5;
   }

   final void n5(String var1) {
      this.k5 = var1;
   }

   final boolean c8() {
      return this.x8;
   }

   final int t2() {
      return this.n3;
   }

   final void l6(int var1) {
      this.n3 = var1;
   }

   final e5n s7() {
      return this.y4;
   }

   final void n5(e5n var1) {
      this.y4 = var1;
   }

   final e5n x8() {
      return this.e2;
   }

   final void l6(e5n var1) {
      this.e2 = var1;
   }

   final e5n n3() {
      return this.t9;
   }

   final void k5(e5n var1) {
      this.t9 = var1;
   }

   final e5n y4() {
      return this.z1;
   }

   final void u3(e5n var1) {
      this.z1 = var1;
   }

   final e5n e2() {
      return this.t4;
   }

   final void a6(e5n var1) {
      this.t4 = var1;
   }

   final e5n t9() {
      return this.q0;
   }

   final void u9(e5n var1) {
      this.q0 = var1;
   }

   final String z1() {
      return this.l6;
   }

   final void l6(String var1) {
      this.l6 = var1;
   }
}
