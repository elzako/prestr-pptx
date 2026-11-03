package com.aspose.slides.internal.k0r;

public class i8 extends r4 {
   private static final int[] n5 = new int[]{4058, Integer.MAX_VALUE, 4026, 0, 4026, 1, 4026, 2};
   private x5 l6;

   public i8() {
      this.w1().n5(4057);
   }

   public final String n5(short var1) {
      for (int var2 = 0; var2 < this.e2().size(); var2++) {
         if (com.aspose.slides.internal.v6g.k5.l6(this.e2().get_Item(var2), z1.class) && ((z1)this.e2().get_Item(var2)).w1().k5() == var1) {
            return ((z1)this.e2().get_Item(var2)).l6();
         }
      }

      return com.aspose.slides.ms.System.d1.n5;
   }

   public final void n5(short var1, String var2) {
      boolean var3 = false;

      for (int var4 = 0; var4 < this.e2().size(); var4++) {
         if (com.aspose.slides.internal.v6g.k5.l6(this.e2().get_Item(var4), z1.class) && ((z1)this.e2().get_Item(var4)).w1().k5() == var1) {
            ((z1)this.e2().get_Item(var4)).n5(var2);
            var3 = true;
            break;
         }
      }

      if (!var3) {
         z1 var5 = new z1(var2, var1);
         this.n5(var5);
      }
   }

   public final x5 l6() {
      if (this.l6 != null) {
         return this.l6;
      }

      this.l6 = (x5)this.k5(4058);
      if (this.l6 == null && this.n3()) {
         this.l6 = new x5();
         this.n5(this.l6);
      }

      return this.l6;
   }

   public final String u3() {
      return this.n5((short)0);
   }

   public final void n5(String var1) {
      this.n5((short)0, var1);
   }

   public final String a6() {
      return this.n5((short)1);
   }

   public final void l6(String var1) {
      this.n5((short)1, var1);
   }

   public final String u9() {
      return this.n5((short)2);
   }

   public final void k5(String var1) {
      this.n5((short)2, var1);
   }

   @Override
   public boolean equals(Object obj) {
      i8 var2 = com.aspose.slides.internal.v6g.k5.n5(obj, i8.class);
      if (var2 == null) {
         return super.equals(obj);
      } else if (this.l6().l6() != var2.l6().l6()) {
         return false;
      } else if (this.l6().k5() != var2.l6().k5()) {
         return false;
      } else if (this.l6().h0() != var2.l6().h0()) {
         return false;
      } else if (this.l6().u3() != var2.l6().u3()) {
         return false;
      } else if (this.l6().a6() != var2.l6().a6()) {
         return false;
      } else if (this.l6().u9() != var2.l6().u9()) {
         return false;
      } else if (!com.aspose.slides.ms.System.d1.a6(this.u9(), var2.u9())) {
         return false;
      } else {
         return !com.aspose.slides.ms.System.d1.a6(this.a6(), var2.a6()) ? false : com.aspose.slides.ms.System.d1.a6(this.u3(), var2.u3());
      }
   }

   @Override
   public int hashCode() {
      return 23454;
   }

   @Override
   protected int[] k5() {
      return n5;
   }
}
