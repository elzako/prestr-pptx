package com.aspose.slides;

public class Placeholder implements IPlaceholder {
   private byte n5;
   private byte l6;
   private byte k5;
   private long u3;
   private w2c a6 = new w2c();

   @Override
   public byte getOrientation() {
      return this.n5;
   }

   @Override
   public byte getSize() {
      return this.l6;
   }

   @Override
   public byte getType() {
      return this.k5;
   }

   @Override
   public long getIndex() {
      return this.u3;
   }

   long n5() {
      return this.u3;
   }

   void n5(long var1) {
      this.u3 = var1;
   }

   boolean l6() {
      return this.k5().n5();
   }

   Placeholder(byte orientation, byte size, byte type, long index, boolean hasCustomPrompt) {
      this.k5 = type;
      this.l6 = size;
      this.n5 = orientation;
      this.u3 = index;
      this.k5().n5(hasCustomPrompt);
   }

   w2c k5() {
      return this.a6;
   }

   Placeholder() {
   }

   void n5(Placeholder var1) {
      this.u3 = var1.u3;
      this.l6 = var1.l6;
      this.k5 = var1.k5;
      this.n5 = var1.n5;
      this.k5().n5(var1.l6());
   }
}
