package com.aspose.slides.internal.d0e;

import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.internal.b5j.y4;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.q1;

public class a6 extends t2 {
   public a6() {
   }

   public a6(String var1) {
      this.u9 = var1;
   }

   public a6(String var1, k5 var2, t2 var3) {
      super(var1, var2, var3);
   }

   public final String n5() {
      return this.l6.k5("xml:base", "");
   }

   public String l6() {
      return this.l6.k5("overflow", "hidden");
   }

   public void n5(String var1) {
      throw new NotImplementedException();
   }

   public final boolean k5() {
      String var1 = this.l6();
      return d1.u3("hidden", var1, (short)3) || d1.u3("scroll", var1, (short)3);
   }

   public final float u3() {
      float var1 = com.aspose.slides.internal.b3z.c8.n5(this.l6.k5("opacity", "1"), 1.0F);
      return q1.l6(1.0F, q1.n5(0.0F, var1));
   }

   public final String a6() {
      return this.l6.k5("style");
   }

   public final String u9() {
      return this.l6.k5("class");
   }

   public final void l6(String var1) {
      this.l6.l6("class", var1);
   }

   public final String h0() {
      return d1.l6(this.l6.k5("stroke", "none"));
   }

   public final void k5(String var1) {
      this.l6.l6("stroke", var1);
   }

   public final com.aspose.slides.internal.b3z.a6 c8() {
      String var1 = this.l6.k5("stroke-width", y4.n5(this.h0()) ? "1" : "0");
      return com.aspose.slides.internal.b3z.a6.n5(var1, com.aspose.slides.internal.b3z.a6.k5(y4.n5(this.h0()) ? 1.0F : 0.0F));
   }

   public final void n5(com.aspose.slides.internal.b3z.a6 var1) {
      this.l6.l6("stroke-width", var1.toString());
   }

   public final float t2() {
      float var1 = com.aspose.slides.internal.b3z.c8.n5(this.l6.k5("stroke-opacity", "1"), 1.0F);
      return this.u3() * q1.l6(1.0F, q1.n5(0.0F, var1));
   }

   public final void n5(float var1) {
      this.l6.l6("stroke-opacity", com.aspose.slides.internal.b3z.c8.n5(var1));
   }

   public final int s7() {
      return com.aspose.slides.internal.b3z.h0.n5(this.l6.k5("stroke-linecap", "butt"));
   }

   public final void n5(int var1) {
      this.l6.l6("stroke-linecap", com.aspose.slides.internal.b3z.h0.n5(var1));
   }

   public final com.aspose.slides.internal.b3z.u9 x8() {
      String var1 = this.l6.k5("stroke-dasharray", "none");
      return com.aspose.slides.internal.b3z.u9.n5(var1);
   }

   public final void n5(com.aspose.slides.internal.b3z.u9 var1) {
      this.l6.l6("stroke-dasharray", var1.toString());
   }

   public final com.aspose.slides.internal.b3z.a6 n3() {
      String var1 = this.l6.k5("stroke-dashoffset", "0");
      return com.aspose.slides.internal.b3z.a6.n5(var1, com.aspose.slides.internal.b3z.a6.k5(0.0F));
   }

   public final String y4() {
      return d1.l6(this.l6.k5("fill", "black"));
   }

   public final void u3(String var1) {
      this.l6.l6("fill", var1);
   }

   public final boolean e2() {
      return !d1.u3("none", this.y4(), (short)3);
   }

   public final float t9() {
      float var1 = com.aspose.slides.internal.b3z.c8.n5(this.l6.k5("fill-opacity", "1"), 1.0F);
      return this.u3() * q1.l6(1.0F, q1.n5(0.0F, var1));
   }

   public final void l6(float var1) {
      this.l6.l6("fill-opacity", com.aspose.slides.internal.b3z.c8.n5(var1));
   }

   public final String z1() {
      return d1.l6(this.l6.n5(new String[]{"marker-start"}, "none"));
   }

   public final void a6(String var1) {
      this.l6.l6("marker-start", var1);
   }

   public final String t4() {
      return d1.l6(this.l6.n5(new String[]{"marker-mid"}, "none"));
   }

   public final String q0() {
      return d1.l6(this.l6.n5(new String[]{"marker-end"}, "none"));
   }

   public final void u9(String var1) {
      this.l6.l6("marker-end", var1);
   }

   public final void l6(int var1) {
      this.l6.l6("pointer-events", com.aspose.slides.internal.a3s.k5.n5(var1));
   }

   public final void k5(int var1) {
      this.l6.l6("text-rendering", com.aspose.slides.internal.a3s.h0.n5(var1));
   }

   public final void u3(int var1) {
      this.l6.l6("shape-rendering", com.aspose.slides.internal.a3s.u3.n5(var1));
   }
}
