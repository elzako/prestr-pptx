package com.aspose.slides.internal.h0;

import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.internal.k5.d5;
import com.aspose.slides.ms.System.Xml.j9;
import com.aspose.slides.ms.System.Xml.s2;

public class q0 implements com.aspose.slides.internal.k5.j5 {
   private e2 n5 = new e2(this);
   private h0 l6;
   private com.aspose.slides.internal.j3.z8 k5;
   private com.aspose.slides.internal.k5.j5 u3;
   private String a6;
   private com.aspose.slides.internal.k5.q0 u9;
   private String h0;
   private d5 c8 = new w1();
   private s2 t2;
   private j9 s7 = new j9();
   private int x8;

   public q0() {
      this(0);
   }

   public q0(int var1) {
      this.t2 = new s2(this.s7);
      this.x8 = var1;
   }

   public final void n5(h0 var1, com.aspose.slides.internal.j3.z8 var2) {
      this.l6 = var1;
      this.k5 = var2;
   }

   public final void n5(com.aspose.slides.internal.k5.j5 var1) {
      this.u3 = var1;
   }

   @Override
   public final String k5() {
      return this.a6;
   }

   public final void n5(String var1) {
      this.a6 = var1;
   }

   public final void l6(String var1) {
      this.h0 = var1;
   }

   @Override
   public final com.aspose.slides.internal.k5.q0 n5() {
      return this.u9;
   }

   public final void n5(com.aspose.slides.internal.k5.q0 var1) {
      this.u9 = var1;
   }

   @Override
   public final com.aspose.slides.internal.k5.z3 l6() {
      return this.n5;
   }

   public final h0 u3() {
      return this.l6;
   }

   public final s2 a6() {
      return this.t2;
   }

   @Override
   public final long n5(String var1, int var2) {
      throw new NotImplementedException();
   }

   @Override
   public final void n5(int var1) {
      this.n5.l6(var1);
   }

   @Override
   public String toString() {
      return this.n5.toString();
   }
}
