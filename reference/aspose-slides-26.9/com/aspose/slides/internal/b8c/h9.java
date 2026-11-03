package com.aspose.slides.internal.b8c;

import com.aspose.slides.exceptions.XmlSchemaException;

public final class h9 extends h1 implements com.aspose.slides.ms.System.Xml.b3, Cloneable {
   private String y4;
   private int e2;
   private int t9;
   private int z1;
   private int t4;
   private int q0 = 0;
   private boolean z3;
   private l2 m1;
   public static final h9 n5 = new h9();

   public h9(com.aspose.slides.ms.System.Xml.k6 var1, String var2) {
      super(var1, var2);
   }

   public h9(com.aspose.slides.ms.System.Xml.k6 var1) {
      super(var1, null);
   }

   private h9() {
   }

   @Override
   public final String n5() {
      return this.j5();
   }

   @Override
   public final String l6() {
      return this.z8().l6();
   }

   @Override
   public final int k5() {
      return this.y4();
   }

   @Override
   public final int u3() {
      return this.n3();
   }

   @Override
   public final boolean a6() {
      return this.t4() != 0;
   }

   @Override
   public final boolean u9() {
      return this.w1();
   }

   @Override
   public final boolean h0() {
      return this.q0() != 0;
   }

   @Override
   public final String c8() {
      return this.z1();
   }

   @Override
   public final Object t2() {
      return this.s3();
   }

   @Override
   public final int s7() {
      return this.t9();
   }

   @Override
   public final int x8() {
      return this.e2();
   }

   public final int n3() {
      return this.t9;
   }

   public final void n5(int var1) {
      this.t9 = var1;
   }

   public final int y4() {
      return this.e2;
   }

   public final void l6(int var1) {
      this.e2 = var1;
   }

   public final int e2() {
      return this.t4;
   }

   public final void k5(int var1) {
      this.t4 = var1;
   }

   public final int t9() {
      return this.z1;
   }

   public final void u3(int var1) {
      this.z1 = var1;
   }

   public final String z1() {
      return this.y4 != null ? this.y4 : com.aspose.slides.ms.System.d1.n5;
   }

   public final void n5(String var1) {
      this.y4 = var1;
   }

   public final int t4() {
      return this.a0().t2();
   }

   public final void a6(int var1) {
      this.n5(v5.u9(var1));
   }

   public final int q0() {
      return this.q0;
   }

   public final void u9(int var1) {
      this.q0 = var1;
   }

   public final boolean z3() {
      return this.z3;
   }

   public final l2 m1() {
      return this.m1;
   }

   public final void n5(l2 var1) {
      this.m1 = var1;
   }

   public final void n5(com.aspose.slides.ms.System.Xml.v0 var1) {
      if (this.h0.t2() == 9 && this.n3 != null && this.n3.size() <= 2) {
         String var2 = this.n3.get_Item(0).toString();
         if (this.n3.size() == 2) {
            String var3 = this.n3.get_Item(1).toString();
            if (("default".equals(var2) || "default".equals(var3)) && ("preserve".equals(var2) || "preserve".equals(var3))) {
               return;
            }
         } else if ("default".equals(var2) || "preserve".equals(var2)) {
            return;
         }
      }

      var1.n5(new XmlSchemaException("Invalid xml:space syntax.", com.aspose.slides.ms.System.d1.n5), 0);
   }

   public final h9 k7() {
      return (h9)this.m3();
   }

   protected Object m3() {
      try {
         return this.clone();
      } catch (CloneNotSupportedException var2) {
         throw new IllegalStateException(var2);
      }
   }
}
