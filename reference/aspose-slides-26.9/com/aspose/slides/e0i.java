package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.List;

class e0i {
   private int n5;
   private List<d3> l6 = new List<>();
   private static final long[] k5 = new long[]{
      262145L,
      325L,
      34805960L,
      344L,
      3L,
      383L,
      131074L,
      470L,
      1L,
      720898L,
      325L,
      44991688L,
      326L,
      44992048L,
      327L,
      3600L,
      337L,
      44991536L,
      339L,
      10800L,
      340L,
      10800L,
      341L,
      44991104L,
      342L,
      60132064L,
      343L,
      44990744L,
      344L,
      2L,
      383L,
      131074L,
      393219L,
      325L,
      38643040L,
      326L,
      38642968L,
      337L,
      38642992L,
      343L,
      38642864L,
      344L,
      2L,
      383L,
      131074L,
      524308L,
      324L,
      0L,
      325L,
      60132272L,
      326L,
      60132296L,
      383L,
      65536L,
      447L,
      1048576L,
      511L,
      1048592L,
      831L,
      524296L,
      959L,
      262148L,
      524320L,
      324L,
      0L,
      325L,
      61130904L,
      344L,
      0L,
      383L,
      65536L,
      447L,
      1048576L,
      511L,
      1048592L,
      831L,
      524296L,
      959L,
      262148L,
      655398L,
      325L,
      61132384L,
      326L,
      61132488L,
      341L,
      61132544L,
      342L,
      61132512L,
      344L,
      0L,
      383L,
      65536L,
      447L,
      1048576L,
      511L,
      1048592L,
      831L,
      524296L,
      959L,
      262148L,
      655427L,
      325L,
      45048600L,
      327L,
      16200L,
      328L,
      5400L,
      337L,
      45048776L,
      338L,
      45048800L,
      341L,
      45048704L,
      342L,
      45048728L,
      343L,
      45048752L,
      344L,
      2L,
      470L,
      1L,
      589899L,
      127L,
      8388736L,
      325L,
      60132120L,
      342L,
      60132168L,
      344L,
      3L,
      383L,
      1179650L,
      447L,
      1048576L,
      470L,
      1L,
      511L,
      524288L,
      831L,
      1048592L,
      721002L,
      325L,
      58372528L,
      326L,
      58372552L,
      327L,
      1350L,
      328L,
      25920L,
      337L,
      58372736L,
      341L,
      58372632L,
      342L,
      58372680L,
      343L,
      58372576L,
      344L,
      2L,
      345L,
      58372704L,
      383L,
      1048576L,
      786568L,
      127L,
      262148L,
      255L,
      1140868096L,
      325L,
      61290880L,
      326L,
      61290904L,
      327L,
      10800L,
      337L,
      61290976L,
      338L,
      61291032L,
      341L,
      61290952L,
      342L,
      61290928L,
      344L,
      2L,
      383L,
      262148L,
      831L,
      524296L,
      786570L,
      127L,
      262148L,
      255L,
      1140868096L,
      325L,
      61290672L,
      326L,
      61290720L,
      327L,
      10800L,
      337L,
      61290800L,
      338L,
      61290824L,
      341L,
      61290848L,
      342L,
      61290752L,
      344L,
      2L,
      383L,
      262148L,
      831L,
      524296L,
      786584L,
      127L,
      262148L,
      255L,
      1145062464L,
      325L,
      61290312L,
      326L,
      61290160L,
      327L,
      9931L,
      337L,
      61290624L,
      338L,
      61290648L,
      341L,
      61290592L,
      342L,
      61290568L,
      344L,
      2L,
      383L,
      262148L,
      831L,
      524296L,
      852126L,
      127L,
      262148L,
      255L,
      1145062464L,
      325L,
      61291104L,
      326L,
      61291136L,
      327L,
      1404L,
      328L,
      10800L,
      337L,
      61291208L,
      338L,
      61291232L,
      341L,
      61291184L,
      342L,
      61291160L,
      344L,
      2L,
      383L,
      262148L,
      831L,
      524296L,
      262346L,
      325L,
      34731720L,
      344L,
      3L,
      383L,
      131074L,
      470L,
      1L
   };

   e0i() {
   }

   e0i(int var1) {
      this();
      this.k5(var1);
   }

   final void n5(com.aspose.slides.internal.k0r.z5 var1) {
      if (var1 != null) {
         d3 var2 = new d3();
         var2.n5 = var1.y4() & 4294967295L;
         var2.l6 = var1.j5();
         this.l6.addItem(var2.n5());
      }
   }

   final long n5(int var1) {
      return this.l6.get_Item(var1).n5;
   }

   final long l6(int var1) {
      return this.l6.get_Item(var1).l6;
   }

   private void k5(int var1) {
      this.n5 = (int)(k5[var1] & 4294967295L & 65535L & 4294967295L & 65535L);
      int var2 = (int)((k5[var1] & 4294967295L) >> 16);

      for (int var3 = 0; var3 < var2; var3++) {
         d3 var4 = new d3();
         var4.n5 = k5[var1 + 1 + var3 * 2];
         var4.l6 = k5[var1 + 2 + var3 * 2];
         this.l6.addItem(var4.n5());
      }
   }

   static void n5(Dictionary<Integer, e0i> var0) {
      if (var0.size() <= 0) {
         int var1 = k5.length;
         if (var1 != 0) {
            for (int var2 = 0; var2 < var1; var2 += (int)(1L + (((k5[var2] & 4294967295L) >> 16 & 4294967295L) * 2L & 4294967295L))) {
               e0i var3 = new e0i(var2);
               var0.addItem(var3.n5(), var3);
            }
         }
      }
   }

   final int n5() {
      return this.n5;
   }

   final int l6() {
      return this.l6.size();
   }
}
