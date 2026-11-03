package com.aspose.slides.Collections;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.ms.System.j3;
import com.aspose.slides.ms.System.u3;
import com.aspose.slides.ms.System.v4;

@j3
public final class BitArray implements ICollection, v4 {
   private int[] n5;
   private int l6;
   private int k5 = 0;

   public BitArray(BitArray bits) {
      if (bits == null) {
         throw new ArgumentNullException("bits");
      }

      this.l6 = bits.l6;
      this.n5 = new int[(this.l6 + 31) / 32];
      if (this.n5.length == 1) {
         this.n5[0] = bits.n5[0];
      } else {
         u3.n5(bits.n5, 0, this.n5, 0, this.n5.length);
      }
   }

   public BitArray(boolean[] values) {
      if (values == null) {
         throw new ArgumentNullException("values");
      }

      this.l6 = values.length;
      this.n5 = new int[(this.l6 + 31) / 32];

      for (int var2 = 0; var2 < values.length; var2++) {
         this.set_Item(var2, values[var2]);
      }
   }

   public BitArray(byte[] bytes) {
      if (bytes == null) {
         throw new ArgumentNullException("bytes");
      }

      this.l6 = bytes.length * 8;
      this.n5 = new int[(this.l6 + 31) / 32];

      for (int var2 = 0; var2 < bytes.length; var2++) {
         this.n5(var2, bytes[var2]);
      }
   }

   public BitArray(int[] values) {
      if (values == null) {
         throw new ArgumentNullException("values");
      }

      int var2 = values.length;
      this.l6 = var2 * 32;
      this.n5 = new int[var2];
      u3.n5(values, 0, this.n5, 0, var2);
   }

   public BitArray(int length) {
      if (length < 0) {
         throw new ArgumentOutOfRangeException("length");
      }

      this.l6 = length;
      this.n5 = new int[(this.l6 + 31) / 32];
   }

   public BitArray(int length, boolean defaultValue) {
      this(length);
      if (defaultValue) {
         for (int var3 = 0; var3 < this.n5.length; var3++) {
            this.n5[var3] = -1;
         }
      }
   }

   private byte n5(int var1) {
      int var2 = var1 / 4;
      int var3 = var1 % 4 * 8;
      int var4 = this.n5[var2] & 255 << var3;
      return (byte)(var4 >> var3 & 0xFF);
   }

   private void n5(int var1, byte var2) {
      int var3 = var1 / 4;
      int var4 = var1 % 4 * 8;
      this.n5[var3] = this.n5[var3] & ~(255 << var4);
      this.n5[var3] = this.n5[var3] | (var2 & 255) << var4;
      this.k5++;
   }

   private void l6(BitArray var1) {
      if (var1 == null) {
         throw new ArgumentNullException();
      }

      if (var1.l6 != this.l6) {
         throw new ArgumentException();
      }
   }

   @Override
   public int size() {
      return this.l6;
   }

   public boolean isReadOnly() {
      return false;
   }

   @Override
   public boolean isSynchronized() {
      return false;
   }

   public boolean get_Item(int index) {
      return this.get(index);
   }

   public void set_Item(int index, boolean value) {
      this.set(index, value);
   }

   public int getLength() {
      return this.l6;
   }

   public void setLength(int value) {
      if (this.l6 != value) {
         if (value < 0) {
            throw new ArgumentOutOfRangeException();
         }

         if (value > this.l6) {
            int var2 = (value + 31) / 32;
            int var3 = (this.l6 + 31) / 32;
            if (var2 > this.n5.length) {
               int[] var4 = new int[var2];
               u3.n5(this.n5, 0, var4, 0, this.n5.length);
               this.n5 = var4;
            } else {
               u3.n5(u3.n5((Object)(this.n5)), var3, var2 - var3);
            }

            int var5 = this.l6 % 32;
            if (var5 > 0) {
               this.n5[var3 - 1] = this.n5[var3 - 1] & (1 << var5) - 1;
            }
         }

         this.l6 = value;
         this.k5++;
      }
   }

   @Override
   public Object getSyncRoot() {
      return this;
   }

   @Override
   public Object deepClone() {
      return new BitArray(this);
   }

   @Override
   public void copyTo(u3 array, int index) {
      if (array == null) {
         throw new ArgumentNullException("array");
      }

      if (index < 0) {
         throw new ArgumentOutOfRangeException("index");
      }

      if (array.u3() != 1) {
         throw new ArgumentException("array", "Array rank must be 1");
      }

      if (index >= array.a6() && this.l6 > 0) {
         throw new ArgumentException("index", "index is greater than array.Length");
      }

      Object var3 = u3.n5(array);
      if (var3 instanceof Boolean[]) {
         if (array.a6() - index < this.l6) {
            throw new ArgumentException();
         }

         Boolean[] var4 = (Boolean[])var3;

         for (int var5 = 0; var5 < this.l6; var5++) {
            var4[index + var5] = this.get_Item(var5);
         }
      } else if (var3 instanceof boolean[]) {
         if (array.a6() - index < this.l6) {
            throw new ArgumentException();
         }

         boolean[] var7 = (boolean[])var3;

         for (int var10 = 0; var10 < this.l6; var10++) {
            var7[index + var10] = this.get_Item(var10);
         }
      } else if (var3 instanceof Byte[]) {
         int var8 = (this.l6 + 7) / 8;
         if (array.a6() - index < var8) {
            throw new ArgumentException();
         }

         Byte[] var11 = (Byte[])var3;

         for (int var6 = 0; var6 < var8; var6++) {
            var11[index + var6] = this.n5(var6);
         }
      } else if (var3 instanceof byte[]) {
         int var9 = (this.l6 + 7) / 8;
         if (array.a6() - index < var9) {
            throw new ArgumentException();
         }

         byte[] var12 = (byte[])var3;

         for (int var13 = 0; var13 < var9; var13++) {
            var12[index + var13] = this.n5(var13);
         }
      } else if (var3 instanceof Integer[]) {
         u3.n5(u3.n5(this.n5), 0, array, index, (this.l6 + 31) / 32);
      } else {
         if (!(var3 instanceof int[])) {
            throw new ArgumentException("array", "Unsupported type");
         }

         u3.n5(u3.n5(this.n5), 0, array, index, (this.l6 + 31) / 32);
      }
   }

   public BitArray not() {
      int var1 = (this.l6 + 31) / 32;

      for (int var2 = 0; var2 < var1; var2++) {
         this.n5[var2] = ~this.n5[var2];
      }

      this.k5++;
      return this;
   }

   public BitArray and(BitArray value) {
      this.l6(value);
      int var2 = (this.l6 + 31) / 32;

      for (int var3 = 0; var3 < var2; var3++) {
         this.n5[var3] = this.n5[var3] & value.n5[var3];
      }

      this.k5++;
      return this;
   }

   public BitArray or(BitArray value) {
      this.l6(value);
      int var2 = (this.l6 + 31) / 32;

      for (int var3 = 0; var3 < var2; var3++) {
         this.n5[var3] = this.n5[var3] | value.n5[var3];
      }

      this.k5++;
      return this;
   }

   public BitArray xor(BitArray value) {
      this.l6(value);
      int var2 = (this.l6 + 31) / 32;

      for (int var3 = 0; var3 < var2; var3++) {
         this.n5[var3] = this.n5[var3] ^ value.n5[var3];
      }

      this.k5++;
      return this;
   }

   public boolean get(int index) {
      if (index >= 0 && index < this.l6) {
         return (this.n5[index >> 5] & 1 << (index & 31)) != 0;
      } else {
         throw new ArgumentOutOfRangeException();
      }
   }

   public void set(int index, boolean value) {
      if (index >= 0 && index < this.l6) {
         if (value) {
            this.n5[index >> 5] = this.n5[index >> 5] | 1 << (index & 31);
         } else {
            this.n5[index >> 5] = this.n5[index >> 5] & ~(1 << (index & 31));
         }

         this.k5++;
      } else {
         throw new ArgumentOutOfRangeException();
      }
   }

   public void setAll(boolean value) {
      if (value) {
         for (int var2 = 0; var2 < this.n5.length; var2++) {
            this.n5[var2] = -1;
         }
      } else {
         u3.n5(u3.n5((Object)(this.n5)), 0, this.n5.length);
      }

      this.k5++;
   }

   @Override
   public IEnumerator iterator() {
      return new BitArray$BitArrayEnumerator(this);
   }

   // $VF: synthetic method
   static int n5(BitArray var0) {
      return var0.k5;
   }
}
