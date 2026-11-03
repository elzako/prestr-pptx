package com.aspose.slides.internal.b7;

import com.aspose.slides.IGenericCloneable;

public final class r6i implements IGenericCloneable<r6i> {
   private int n5 = 1;
   private int l6 = 0;
   private byte[] k5 = new byte[0];
   private String u3;

   public r6i(String var1) {
      this.n5(var1);
   }

   public String n5() {
      return this.u3;
   }

   public void n5(String var1) {
      this.u3 = var1;
   }

   public int l6() {
      return this.n5;
   }

   public void n5(int var1) {
      this.n5 = var1;
   }

   public byte[] k5() {
      return this.k5;
   }

   public void n5(byte[] var1) {
      if (var1 != this.k5) {
         if (null == var1) {
            this.k5 = new byte[0];
         } else {
            this.k5 = new byte[var1.length];
            System.arraycopy(var1, 0, this.k5, 0, var1.length);
         }
      }
   }

   public int u3() {
      return this.l6;
   }

   public void l6(int var1) {
      this.l6 = var1;
   }

   public r6i a6() {
      return new r6i(this);
   }

   private r6i(r6i var1) {
      this.n5(var1.n5());
      this.n5(var1.l6());
      this.l6(var1.u3());
      this.n5(var1.k5());
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public r6i cloneT() {
      return this.a6();
   }

}
