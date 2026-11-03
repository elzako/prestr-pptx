package com.aspose.slides.Collections.Specialized;

import com.aspose.slides.internal.l7h.a5;
import com.aspose.slides.internal.v6g.h0;
import com.aspose.slides.internal.v6g.k5;
import com.aspose.slides.ms.System.z3;

public class BitVector32$Section extends h0<BitVector32$Section> {
   private short n5;
   private short l6;

   public BitVector32$Section() {
   }

   BitVector32$Section(short mask, short offset) {
      this.n5 = mask;
      this.l6 = offset;
   }

   public short getMask() {
      return this.n5;
   }

   public short getOffset() {
      return this.l6;
   }

   public static boolean op_Equality(BitVector32$Section a, BitVector32$Section b) {
      return a.n5 == b.n5 && a.l6 == b.l6;
   }

   public static boolean op_Inequality(BitVector32$Section a, BitVector32$Section b) {
      return a.n5 != b.n5 || a.l6 != b.l6;
   }

   public boolean equals(BitVector32$Section obj) {
      return this.n5 == obj.n5 && this.l6 == obj.l6;
   }

   @Override
   public boolean equals(Object o) {
      if (!k5.l6(o, BitVector32$Section.class)) {
         return false;
      }

      BitVector32$Section var2 = k5.u3(o, BitVector32$Section.class).Clone();
      return this.n5 == var2.n5 && this.l6 == var2.l6;
   }

   @Override
   public int hashCode() {
      return this.n5 << this.l6;
   }

   @Override
   public String toString() {
      return toString(this.Clone());
   }

   public static String toString(BitVector32$Section value) {
      a5 var1 = new a5();
      var1.n5("Section{0x");
      var1.n5(z3.n5(value.getMask(), 16));
      var1.n5(", 0x");
      var1.n5(z3.n5(value.getOffset(), 16));
      var1.n5("}");
      return var1.toString();
   }

   public void CloneTo(BitVector32$Section that) {
      that.n5 = this.n5;
      that.l6 = this.l6;
   }

   public BitVector32$Section Clone() {
      BitVector32$Section var1 = new BitVector32$Section();
      this.CloneTo(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.Clone();
   }

   public static boolean equals(BitVector32$Section obj1, BitVector32$Section obj2) {
      return obj1.equals(obj2);
   }
}
