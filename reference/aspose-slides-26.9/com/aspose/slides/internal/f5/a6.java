package com.aspose.slides.internal.f5;

import com.aspose.slides.internal.l7h.a5;
import com.aspose.slides.ms.System.d1;

public abstract class a6 extends r4 implements com.aspose.slides.internal.j3.u9 {
   private String n5;

   protected a6(String var1, z1 var2) {
      super(var2);
      this.n5 = var1;
   }

   @Override
   public String n5() {
      return this.n5 != null ? this.n5 : d1.n5;
   }

   public void n5(String var1) {
      this.n5 = var1;
   }

   public final int l6() {
      return this.n5 != null ? this.n5.length() : 0;
   }

   public String n5(int var1, int var2) {
      int var3 = this.l6();
      return this.l6() == 0 ? d1.n5 : d1.l6(this.n5, var1, var2);
   }

   @Override
   public void u3(String var1) {
      this.n5 = new a5(this.n5).n5(var1).toString();
   }

   public void n5(int var1, String var2) {
      this.n5 = new a5(this.n5).n5(var1, var2).toString();
   }

   public void l6(int var1, int var2) {
      this.n5 = new a5(this.n5).l6(var1, var2).toString();
   }

   public void n5(int var1, int var2, String var3) {
      this.n5 = new a5(this.n5).l6(var1, var2).n5(var1, var3).toString();
   }
}
