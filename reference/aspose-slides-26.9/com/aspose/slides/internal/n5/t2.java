package com.aspose.slides.internal.n5;

import java.io.Serializable;

public class t2 implements y2, Serializable {
   protected int n5;
   protected int l6;
   protected int k5 = -1;
   protected int u3 = 0;
   protected transient u9 a6;
   protected String u9;
   protected int h0 = -1;
   protected int c8;
   protected int t2;

   public t2(int var1) {
      this.n5 = var1;
   }

   public t2(u9 var1, int var2, int var3, int var4, int var5) {
      this.a6 = var1;
      this.n5 = var2;
      this.u3 = var3;
      this.c8 = var4;
      this.t2 = var5;
   }

   public t2(int var1, String var2) {
      this.n5 = var1;
      this.u3 = 0;
      this.u9 = var2;
   }

   @Override
   public int n5() {
      return this.n5;
   }

   @Override
   public void n5(int var1) {
      this.l6 = var1;
   }

   @Override
   public String l6() {
      if (this.u9 != null) {
         return this.u9;
      }

      if (this.a6 == null) {
         return null;
      }

      this.u9 = this.a6.n5(this.c8, this.t2);
      return this.u9;
   }

   @Override
   public void n5(String var1) {
      this.u9 = var1;
   }

   @Override
   public int k5() {
      return this.l6;
   }

   @Override
   public int u3() {
      return this.k5;
   }

   @Override
   public void l6(int var1) {
      this.k5 = var1;
   }

   @Override
   public int a6() {
      return this.u3;
   }

   @Override
   public void k5(int var1) {
      this.u3 = var1;
   }

   @Override
   public void u3(int var1) {
      this.n5 = var1;
   }

   public int h0() {
      return this.c8;
   }

   @Override
   public int u9() {
      return this.h0;
   }

   @Override
   public void a6(int var1) {
      this.h0 = var1;
   }

   public void n5(u9 var1) {
      this.a6 = var1;
   }

   @Override
   public String toString() {
      String var1 = "";
      if (this.u3 > 0) {
         var1 = ",channel=" + this.u3;
      }

      String var2 = this.l6();
      if (var2 != null) {
         var2 = var2.replaceAll("\n", "\\\\n");
         var2 = var2.replaceAll("\r", "\\\\r");
         var2 = var2.replaceAll("\t", "\\\\t");
      } else {
         var2 = "<no text>";
      }

      return "[@" + this.u9() + "," + this.c8 + ":" + this.t2 + "='" + var2 + "',<" + this.n5 + ">" + var1 + "," + this.l6 + ":" + this.u3() + "]";
   }
}
