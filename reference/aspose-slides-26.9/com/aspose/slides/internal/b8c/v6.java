package com.aspose.slides.internal.b8c;

public final class v6 implements com.aspose.slides.ms.System.Xml.o0 {
   private com.aspose.slides.ms.System.Xml.k6 n5;
   private String l6;
   private String k5;
   private String u3;
   private com.aspose.slides.ms.System.Xml.k6 a6;
   private int u9;
   private int h0;
   private boolean c8;
   private boolean t2;
   private boolean s7;
   private boolean x8;
   private String n3;
   private String y4;

   public v6(com.aspose.slides.ms.System.Xml.k6 var1, boolean var2) {
      this.a6 = com.aspose.slides.ms.System.Xml.k6.n5;
      this.n5 = var1;
      this.c8 = var2;
   }

   @Override
   public final String n5() {
      return this.y4().l6();
   }

   @Override
   public final boolean l6() {
      return this.z1();
   }

   @Override
   public final boolean k5() {
      return this.t4();
   }

   @Override
   public final boolean u3() {
      return !this.q0().k5();
   }

   @Override
   public final boolean a6() {
      return this.c8;
   }

   @Override
   public final String u9() {
      return this.m3();
   }

   @Override
   public final String h0() {
      return this.j5();
   }

   @Override
   public final String c8() {
      return this.e2();
   }

   @Override
   public final String t2() {
      return this.t9();
   }

   @Override
   public final String s7() {
      return this.z3();
   }

   @Override
   public final int x8() {
      return this.m1();
   }

   @Override
   public final int n3() {
      return this.k7();
   }

   public static boolean n5(String var0) {
      return "lt".equals(var0) || "gt".equals(var0) || "amp".equals(var0) || "apos".equals(var0) || "quot".equals(var0);
   }

   public final com.aspose.slides.ms.System.Xml.k6 y4() {
      return this.n5;
   }

   public final String e2() {
      return this.l6;
   }

   public final void l6(String var1) {
      this.l6 = var1;
      this.t2 = true;
   }

   public final String t9() {
      return this.k5;
   }

   public final void k5(String var1) {
      this.k5 = var1;
   }

   public final boolean z1() {
      return this.t2;
   }

   public final void n5(boolean var1) {
      this.t2 = var1;
   }

   public final boolean t4() {
      return this.x8;
   }

   public final void l6(boolean var1) {
      this.x8 = var1;
   }

   public final com.aspose.slides.ms.System.Xml.k6 q0() {
      return this.a6;
   }

   public final void n5(com.aspose.slides.ms.System.Xml.k6 var1) {
      this.a6 = var1;
   }

   public final String z3() {
      return this.u3;
   }

   public final void u3(String var1) {
      this.u3 = var1;
      this.t2 = false;
   }

   public final int m1() {
      return this.u9;
   }

   public final void n5(int var1) {
      this.u9 = var1;
   }

   public final int k7() {
      return this.h0;
   }

   public final void l6(int var1) {
      this.h0 = var1;
   }

   public final String m3() {
      return this.n3 == null ? com.aspose.slides.ms.System.d1.n5 : this.n3;
   }

   public final void a6(String var1) {
      this.n3 = var1;
   }

   public final boolean z8() {
      return this.s7;
   }

   public final void k5(boolean var1) {
      this.s7 = var1;
   }

   public final String j5() {
      return this.y4 == null ? com.aspose.slides.ms.System.d1.n5 : this.y4;
   }

   public final void u9(String var1) {
      this.y4 = var1;
   }
}
