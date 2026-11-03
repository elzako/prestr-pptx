package com.aspose.slides.internal.t3o;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.ms.System.q1;

public class n5 {
   static final int[] n5 = new int[]{
      3,
      7,
      11,
      17,
      23,
      29,
      37,
      47,
      59,
      71,
      89,
      107,
      131,
      163,
      197,
      239,
      293,
      353,
      431,
      521,
      631,
      761,
      919,
      1103,
      1327,
      1597,
      1931,
      2333,
      2801,
      3371,
      4049,
      4861,
      5839,
      7013,
      8419,
      10103,
      12143,
      14591,
      17519,
      21023,
      25229,
      30293,
      36353,
      43627,
      52361,
      62851,
      75431,
      90523,
      108631,
      130363,
      156437,
      187751,
      225307,
      270371,
      324449,
      389357,
      467237,
      560689,
      672827,
      807403,
      968897,
      1162687,
      1395263,
      1674319,
      2009191,
      2411033,
      2893249,
      3471899,
      4166287,
      4999559,
      5999471,
      7199369
   };

   public static int n5(int var0) {
      if (var0 < 0) {
         throw new ArgumentException("Hashtable's capacity overflowed and went negative. Check load factor, capacity and the current size of the table");
      }

      for (int var1 = 0; var1 < n5.length; var1++) {
         int var2 = n5[var1];
         if (var2 >= var0) {
            return var2;
         }
      }

      for (int var3 = var0 | 1; var3 < Integer.MAX_VALUE; var3 += 2) {
         if (l6(var3)) {
            return var3;
         }
      }

      return var0;
   }

   static boolean l6(int var0) {
      if ((var0 & 1) == 0) {
         return var0 == 2;
      }

      int var1 = (int)q1.z3(var0);

      for (int var2 = 3; var2 <= var1; var2 += 2) {
         if (var0 % var2 == 0) {
            return false;
         }
      }

      return true;
   }
}
