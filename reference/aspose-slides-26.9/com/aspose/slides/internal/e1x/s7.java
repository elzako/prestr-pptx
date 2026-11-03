package com.aspose.slides.internal.e1x;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericDictionary;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.ms.System.IDisposable;

public class s7 extends n3 {
   private final Dictionary<String, com.aspose.slides.internal.o9b.y4> n5 = new Dictionary<>();
   private static final int[] l6 = new int[]{
      1078,
      1052,
      1025,
      2049,
      3073,
      4097,
      5121,
      6145,
      7169,
      8193,
      9217,
      10241,
      11265,
      12289,
      13313,
      14337,
      15361,
      16385,
      1067,
      1101,
      1068,
      2092,
      1069,
      1059,
      1093,
      1026,
      1109,
      1027,
      1028,
      2052,
      3076,
      4100,
      5124,
      1050,
      1029,
      1030,
      1043,
      2067,
      1033,
      2057,
      3081,
      4105,
      5129,
      6153,
      7177,
      8201,
      9225,
      10249,
      11273,
      12297,
      13321,
      1061,
      1080,
      1065,
      1035,
      1036,
      2060,
      3084,
      4108,
      5132,
      6156,
      1079,
      1031,
      2055,
      3079,
      4103,
      5127,
      1032,
      1095,
      1037,
      1081,
      1038,
      1039,
      1057,
      1040,
      2064,
      1041,
      1099,
      2144,
      1087,
      1111,
      1042,
      2066,
      1062,
      1063,
      2087,
      1071,
      1086,
      2110,
      1100,
      1112,
      1102,
      2145,
      1044,
      2068,
      1096,
      1045,
      1046,
      2070,
      1094,
      1048,
      1049,
      1103,
      3098,
      2074,
      1113,
      1051,
      1060,
      1034,
      2058,
      3082,
      4106,
      5130,
      6154,
      7178,
      8202,
      9226,
      10250,
      11274,
      12298,
      13322,
      14346,
      15370,
      16394,
      17418,
      18442,
      19466,
      20490,
      1072,
      1089,
      1053,
      2077,
      1097,
      1092,
      1098,
      1054,
      1055,
      1058,
      1056,
      2080,
      1091,
      2115,
      1066
   };

   public s7(String[] var1, byte[][] var2) {
      super(var1, var2);
   }

   @Override
   public com.aspose.slides.internal.o9b.n3 n5(String var1, float var2, int var3) {
      this.x8();
      com.aspose.slides.internal.o9b.y4 var4 = null;
      i1 var5 = this.c8().l6(var1, var3, false);
      if (var5 != null) {
         var4 = k7.n5(var5);
      }

      if (var4 != null) {
         try {
            return com.aspose.slides.internal.o9b.n3.n5(var4, var2, var3);
         } catch (ArgumentException var8) {
         }
      }

      com.aspose.slides.internal.o9b.y4[] var6 = new com.aspose.slides.internal.o9b.y4[]{var4};
      boolean var7 = this.n5.tryGetValue(var1, var6) && var6[0].c8(var3);
      var4 = var6[0];
      return var7 ? com.aspose.slides.internal.o9b.n3.n5(var4, var2, var3) : null;
   }

   @Override
   public i1 n5(String var1, int var2) {
      return this.c8().l6(var1, var2, true);
   }

   @Override
   public z3[] k5() {
      return this.c8().l6();
   }

   @Override
   public i1 l6(String var1, int var2) {
      return this.c8().l6(var1, var2, false);
   }

   @Override
   public i1 n5(int var1) {
      return this.c8().n5(var1);
   }

   @Override
   protected void u3() {
      super.u3();
      this.n5.clear();
   }

   @Override
   protected void l6(String var1) {
      List var2 = k7.n5(var1);
      List$Enumerator var3 = var2.iterator();

      try {
         while (var3.hasNext()) {
            com.aspose.slides.internal.o9b.y4 var4 = (com.aspose.slides.internal.o9b.y4)var3.next();
            this.n5(var4);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }
   }

   @Override
   protected void l6(byte[] var1) {
      this.k5(k7.n5(var1));
   }

   private void k5(List<com.aspose.slides.internal.o9b.y4> var1) {
      List$Enumerator var2 = var1.iterator();

      try {
         while (var2.hasNext()) {
            com.aspose.slides.internal.o9b.y4 var3 = (com.aspose.slides.internal.o9b.y4)var2.next();
            this.n5(var3);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }
   }

   private void n5(com.aspose.slides.internal.o9b.y4 var1) {
      if (var1 != null) {
         for (int var2 = 0; var2 < l6.length; var2++) {
            this.n5.set_Item(var1.n5(l6[var2]), var1);
         }
      }
   }

   @Override
   void n5(IGenericDictionary<String, String> var1) {
   }
}
