package com.aspose.slides.Collections.Generic;

public abstract class RBTree$Node {
   public RBTree$Node left;
   public RBTree$Node right;
   private long n5 = 2L;

   public boolean isBlack() {
      return (this.n5 & 4294967295L & 1L) == 1L;
   }

   public void isBlack(boolean value) {
      this.n5 = value ? this.n5 & 4294967295L | 1L : this.n5 & 4294967295L & -2L;
   }

   public long getSize() {
      return (this.n5 & 4294967295L) >> 1;
   }

   public void setSize(long value) {
      this.n5 = value << 1 & 4294967295L | this.n5 & 4294967295L & 1L;
   }

   public long fixSize() {
      this.setSize(1L);
      if (this.left != null) {
         this.setSize(this.getSize() + this.left.getSize());
      }

      if (this.right != null) {
         this.setSize(this.getSize() + this.right.getSize());
      }

      return this.getSize();
   }

   public abstract void swapValue(RBTree$Node var1);
}
