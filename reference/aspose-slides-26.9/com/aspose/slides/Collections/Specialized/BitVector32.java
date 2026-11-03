package com.aspose.slides.Collections.Specialized;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.l7h.a5;
import com.aspose.slides.internal.v6g.h0;
import com.aspose.slides.internal.v6g.k5;
import com.aspose.slides.ms.System.a3;

public class BitVector32 extends h0<BitVector32> {
   private int n5;

   public BitVector32() {
   }

   public BitVector32(BitVector32 value) {
      this.n5 = value.n5;
   }

   public BitVector32(int data) {
      this.n5 = data;
   }

   public int getData() {
      return this.n5;
   }

   public int get_Item(BitVector32$Section section) {
      return this.n5 >> section.getOffset() & section.getMask();
   }

   public void set_Item(BitVector32$Section section, int value) {
      if (value < 0) {
         throw new ArgumentException("Section can't hold negative values");
      }

      if (value > section.getMask()) {
         throw new ArgumentException("Value too large to fit in section");
      }

      this.n5 = this.n5 & ~(section.getMask() << section.getOffset());
      this.n5 = this.n5 | value << section.getOffset();
   }

   public boolean get_Item(int bit) {
      return (this.n5 & bit) == bit;
   }

   public void set_Item(int bit, boolean value) {
      if (value) {
         this.n5 |= bit;
      } else {
         this.n5 &= ~bit;
      }
   }

   public static int createMask() {
      return 1;
   }

   public static int createMask(int previous) {
      if (previous == 0) {
         return 1;
      } else if (previous == Integer.MIN_VALUE) {
         throw new InvalidOperationException("all bits set");
      } else {
         return previous << 1;
      }
   }

   public static BitVector32$Section createSection(short maxValue) {
      return createSection(maxValue, new BitVector32$Section((short)0, (short)0));
   }

   public static BitVector32$Section createSection(short maxValue, BitVector32$Section previous) {
      if (maxValue < 1) {
         throw new ArgumentException("maxValue");
      } else {
         int var2 = n5(maxValue);
         int var3 = (1 << var2) - 1;
         int var4 = previous.getOffset() + n5(previous.getMask());
         if (var4 + var2 > 32) {
            throw new ArgumentException("Sections cannot exceed 32 bits in total");
         } else {
            return new BitVector32$Section(k5.l6(var3, 9), k5.l6(var4, 9));
         }
      }
   }

   @Override
   public boolean equals(Object o) {
      return k5.l6(o, BitVector32.class) && this.n5 == k5.u3(o, BitVector32.class).n5;
   }

   @Override
   public int hashCode() {
      return a3.n5(this.n5);
   }

   @Override
   public String toString() {
      return toString(this.Clone());
   }

   public static String toString(BitVector32 value) {
      a5 var1 = new a5();
      var1.n5("BitVector32{");

      for (long var2 = k5.u9(2147483648L, 10); var2 > 0L; var2 >>= 1) {
         var1.n5((char)((value.n5 & var2) == 0L ? '0' : '1'));
      }

      var1.n5('}');
      return var1.toString();
   }

   private static int n5(int var0) {
      int var1 = 0;

      while (var0 >> var1 != 0) {
         var1++;
      }

      return var1;
   }

   public void CloneTo(BitVector32 that) {
      that.n5 = this.n5;
   }

   public BitVector32 Clone() {
      BitVector32 var1 = new BitVector32();
      this.CloneTo(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.Clone();
   }

   public static boolean equals(BitVector32 obj1, BitVector32 obj2) {
      return obj1.equals(obj2);
   }
}
