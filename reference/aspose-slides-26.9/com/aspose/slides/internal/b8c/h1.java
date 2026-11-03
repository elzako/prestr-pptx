package com.aspose.slides.internal.b8c;

import com.aspose.slides.Collections.Generic.List;

public abstract class h1 {
   protected com.aspose.slides.ms.System.Xml.k6 l6 = com.aspose.slides.ms.System.Xml.k6.n5;
   protected String k5;
   protected boolean u3 = false;
   protected int a6;
   protected j9e u9;
   protected v5 h0;
   protected String c8;
   protected Object t2;
   protected long s7;
   protected long x8;
   protected List<String> n3;

   protected h1(com.aspose.slides.ms.System.Xml.k6 var1, String var2) {
      this.l6 = var1;
      this.k5 = var2;
      this.s7 = -1L;
      this.x8 = -1L;
   }

   protected h1() {
   }

   public final com.aspose.slides.ms.System.Xml.k6 z8() {
      return this.l6;
   }

   public final void n5(com.aspose.slides.ms.System.Xml.k6 var1) {
      this.l6 = var1;
   }

   public final String j5() {
      return this.k5 == null ? com.aspose.slides.ms.System.d1.n5 : this.k5;
   }

   public final void l6(String var1) {
      this.k5 = var1;
   }

   public final boolean w1() {
      return this.u3;
   }

   public final void n5(boolean var1) {
      this.u3 = var1;
   }

   public final int r4() {
      return this.a6;
   }

   public final void h0(int var1) {
      this.a6 = var1;
   }

   public final long c4() {
      return this.s7;
   }

   public final void n5(long var1) {
      this.s7 = var1;
   }

   public final long y2() {
      return this.x8;
   }

   public final void l6(long var1) {
      this.x8 = var1;
   }

   public final j9e y1() {
      return this.u9;
   }

   public final void n5(j9e var1) {
      this.u9 = var1;
   }

   public final v5 a0() {
      return this.h0;
   }

   public final void n5(v5 var1) {
      this.h0 = var1;
   }

   public final void k5(String var1) {
      if (this.n3 == null) {
         this.n3 = new List<>();
      }

      this.n3.addItem(var1);
   }

   public final List<String> d2() {
      return this.n3;
   }

   public final void n5(List<String> var1) {
      this.n3 = var1;
   }

   public final String d5() {
      return this.c8 != null ? this.c8 : com.aspose.slides.ms.System.d1.n5;
   }

   public final void u3(String var1) {
      this.c8 = var1;
   }

   public final Object s3() {
      return this.t2;
   }

   public final void n5(Object var1) {
      this.t2 = var1;
   }

   public final boolean l6(Object var1) {
      return this.h0.t2() != 8 && this.h0.t2() != 9 || this.n3.containsItem(var1.toString());
   }

   public final boolean k5(Object var1) {
      return this.a6 != 3 && this.a6 != 4 || this.t2 != null && this.h0.n5(var1, this.t2);
   }
}
