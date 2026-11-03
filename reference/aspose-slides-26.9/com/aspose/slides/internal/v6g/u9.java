package com.aspose.slides.internal.v6g;

public final class u9 {
   private final String[] l6;
   private final u9$n5[] k5;
   private final int u3;
   // $VF: synthetic field
   static final boolean n5 = !u9.class.desiredAssertionStatus();

   public u9(String... var1) {
      this.l6 = var1;
      int var2 = l6(this.l6.length);
      this.k5 = new u9$n5[var2];
      this.u3 = var2 - 1;

      for (int var3 = 0; var3 < this.l6.length; var3++) {
         String var4 = this.l6[var3];
         assert var4 != null : "The map doesn't accept null keys.";
         int var5 = var4.hashCode();
         int var6 = n5(var5);

         while (true) {
            int var7 = var6 & this.u3;
            u9$n5 var8 = this.k5[var7];
            if (var8 == null) {
               this.k5[var7] = new u9$n5(var4, var3);
               break;
            }

            if (var8.n5.equals(var4)) {
               throw new IllegalArgumentException("duplicate key: " + var4);
            }

            var6++;
         }
      }
   }

   public int n5(String var1) {
      if (var1 == null) {
         return -1;
      }

      int var2 = n5(var1.hashCode());

      while (true) {
         int var3 = var2 & this.u3;
         u9$n5 var4 = this.k5[var3];
         if (var4 == null) {
            return -1;
         }

         if (var4.n5.equals(var1)) {
            return var4.l6;
         }

         var2++;
      }
   }

   private static int n5(int var0) {
      var0 ^= var0 >>> 20 ^ var0 >>> 12;
      return var0 ^ var0 >>> 7 ^ var0 >>> 4;
   }

   private static int l6(int var0) {
      if (var0 < 536870912) {
         return Integer.highestOneBit(var0) << 2;
      }

      assert var0 < 1073741824 : "collection too large";
      return 1073741824;
   }

   @Override
   public String toString() {
      StringBuilder var1 = new StringBuilder(this.l6.length * 16).append('{');

      for (String var5 : this.l6) {
         var1.append(var5).append(" : ").append(this.n5(var5)).append("\r\n");
      }

      return var1.append('}').toString();
   }
}
