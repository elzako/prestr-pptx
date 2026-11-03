package com.aspose.slides.internal.z4;

public class w1 extends z1 {
   private final y1 n5;
   private m1 k5;
   private final r4 u3 = new r4();

   public w1(c8 var1) {
      super(var1);
      this.n5 = new y1(var1);
   }

   public final void n5(String var1) {
      this.u3.addItem(var1);
   }

   @Override
   public void n5(t4 var1) {
      var1.n5(this);
      var1.c8();
      var1.k5("/Type", "/Pages");
      var1.n5("/Count", this.u3.size());
      var1.n5("/Kids");
      this.u3.n5(var1);
      var1.t2();
      var1.l6();
      this.n5.k5(var1);
   }

   public final int n5() {
      return this.u3.size();
   }

   public final y1 l6() {
      return this.n5;
   }

   public final m1 k5() {
      return this.k5;
   }

   public final void u3() {
      if (this.k5 == null) {
         this.k5 = new m1(this.h0());
      }
   }
}
