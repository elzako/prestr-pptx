package com.aspose.slides.internal.k0r;

public class w1 extends r4 {
   private static final int[] n5 = new int[]{4026, 0, 12005, Integer.MAX_VALUE};

   public w1() {
      this.w1().n5(12004);
   }

   public final String n5(short var1) {
      for (int var2 = 0; var2 < this.e2().size(); var2++) {
         if (com.aspose.slides.internal.v6g.k5.l6(this.e2().get_Item(var2), z1.class) && ((z1)this.e2().get_Item(var2)).w1().k5() == var1) {
            return ((z1)this.e2().get_Item(var2)).l6();
         }
      }

      return "";
   }

   public final String l6() {
      return this.n5((short)0);
   }

   public final j5 u3() {
      return com.aspose.slides.internal.v6g.k5.n5(this.k5(12005), j5.class);
   }

   @Override
   protected int[] k5() {
      return n5;
   }
}
