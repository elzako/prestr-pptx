package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;

class g8z extends DomObject<Presentation> implements IGenericEnumerable<z2x> {
   private final Dictionary<com.aspose.slides.ms.System.o0, z2x> n5 = new Dictionary<>();
   private final q3a l6 = new q3a();
   private static final Dictionary<com.aspose.slides.ms.System.o0, Integer> k5 = new Dictionary<>();
   private static final Dictionary<Integer, com.aspose.slides.ms.System.o0> u3 = new Dictionary<>();

   g8z(Presentation var1) {
      super(var1);
      this.n5().n5(new com.aspose.slides.ms.System.o0("5C22544A-7EE6-4342-B048-85BDC9FD1C3A"));
   }

   final q3a n5() {
      return this.l6;
   }

   final z2x n5(com.aspose.slides.ms.System.o0 var1) {
      z2x var2 = null;
      if (this.n5.containsKey(var1.k5())) {
         var2 = this.n5.get_Item(var1.k5());
      }

      if (var2 != null) {
         return var2;
      }

      int var3 = this.l6(var1.k5());
      return var3 == -1 ? null : w4m.n5(this, var3);
   }

   public final int l6(com.aspose.slides.ms.System.o0 var1) {
      int var2 = 0;
      Integer[] var3 = new Integer[]{var2};
      boolean var4 = k5.tryGetValue(var1.k5(), var3);
      var2 = var3[0];
      return var4 ? var2 : -1;
   }

   public final com.aspose.slides.ms.System.o0 n5(int var1) {
      com.aspose.slides.ms.System.o0 var2 = new com.aspose.slides.ms.System.o0();
      com.aspose.slides.ms.System.o0[] var3 = new com.aspose.slides.ms.System.o0[]{var2};
      boolean var4 = u3.tryGetValue(var1, var3);
      var3[0].k5(var2);
      return var4 ? var2 : com.aspose.slides.ms.System.o0.n5;
   }

   private static void n5(int var0, com.aspose.slides.ms.System.o0 var1, String var2) {
      k5.addItem(var1.k5(), var0);
      u3.addItem(var0, var1.k5());
   }

   @Override
   public final IGenericEnumerator<z2x> iterator() {
      return this.n5().n5().iterator();
   }

   final boolean k5(com.aspose.slides.ms.System.o0 var1) {
      return this.n5.containsKey(var1.k5());
   }

   final void n5(z2x var1) {
      this.n5.addItem(var1.n5().n5().k5(), var1);
      this.n5().n5().addItem(var1);
   }

   public final z2x n5(com.aspose.slides.ms.System.o0 var1, String var2) {
      z2x var3 = new z2x(this, var1.k5(), var2);
      this.n5(var3);
      return var3;
   }

   static {
      n5(
         1,
         new com.aspose.slides.ms.System.o0(
            1545753674, (short)32486, (short)17218, (byte)-80, (byte)72, (byte)-123, (byte)-67, (byte)-55, (byte)-3, (byte)28, (byte)58
         ),
         "Medium Style 2 - Accent 1"
      );
      n5(
         2,
         new com.aspose.slides.ms.System.o0(
            121245098, (short)27379, (short)17323, (byte)-123, (byte)-120, (byte)-50, (byte)-63, (byte)-48, (byte)108, (byte)114, (byte)-71
         ),
         "Medium Style 2"
      );
      n5(
         3,
         new com.aspose.slides.ms.System.o0(
            760920870, (short)1415, (short)19504, (byte)-119, (byte)-103, (byte)-110, (byte)-8, (byte)31, (byte)-48, (byte)48, (byte)124
         ),
         "No Style, No Grid"
      );
      n5(
         4,
         new com.aspose.slides.ms.System.o0(
            1009777245, (short)-30796, (short)17770, (byte)-104, (byte)33, (byte)29, (byte)80, (byte)36, (byte)104, (byte)-49, (byte)15
         ),
         "Themed Style 1 - Accent 1"
      );
      n5(
         5,
         new com.aspose.slides.ms.System.o0(
            676217466, (short)15701, (short)17155, (byte)-65, (byte)-128, (byte)100, (byte)85, (byte)3, (byte)110, (byte)29, (byte)-25
         ),
         "Themed Style 1 - Accent 2"
      );
      n5(
         6,
         new com.aspose.slides.ms.System.o0(
            1774683452, (short)21357, (short)19062, (byte)-96, (byte)-82, (byte)-35, (byte)34, (byte)18, (byte)77, (byte)85, (byte)-91
         ),
         "Themed Style 1 - Accent 3"
      );
      n5(
         7,
         new com.aspose.slides.ms.System.o0(
            2002635522, (short)-25672, (short)18429, (byte)-119, (byte)7, (byte)-123, (byte)-57, (byte)-108, (byte)-9, (byte)-109, (byte)-70
         ),
         "Themed Style 1 - Accent 4"
      );
      n5(
         8,
         new com.aspose.slides.ms.System.o0(
            896896951, (short)-25915, (short)17746, (byte)-118, (byte)83, (byte)-55, (byte)24, (byte)5, (byte)-27, (byte)71, (byte)-6
         ),
         "Themed Style 1 - Accent 5"
      );
      n5(
         9,
         new com.aspose.slides.ms.System.o0(
            150700925, (short)-14297, (short)20218, (byte)-96, (byte)87, (byte)77, (byte)5, (byte)-128, (byte)126, (byte)15, (byte)124
         ),
         "Themed Style 1 - Accent 6"
      );
      n5(
         10,
         new com.aspose.slides.ms.System.o0(
            1497392986, (short)-19079, (short)17934, (byte)-108, (byte)-47, (byte)84, (byte)34, (byte)44, (byte)99, (byte)-11, (byte)-38
         ),
         "No Style, Table Grid"
      );
      n5(
         11,
         new com.aspose.slides.ms.System.o0(
            3507726802L, 40299, 18729, (short)-86, (short)45, (short)-14, (short)59, (short)94, (short)-24, (short)-53, (short)-25
         ),
         "Themed Style 2 - Accent 1"
      );
      n5(
         12,
         new com.aspose.slides.ms.System.o0(
            408960988, (short)-7382, (short)19125, (byte)-104, (byte)-100, (byte)8, (byte)100, (byte)-61, (byte)-22, (byte)-46, (byte)-72
         ),
         "Themed Style 2 - Accent 2"
      );
      n5(
         13,
         new com.aspose.slides.ms.System.o0(
            812095992, (short)1886, (short)19002, (byte)-89, (byte)-10, (byte)127, (byte)-68, (byte)101, (byte)118, (byte)-15, (byte)-92
         ),
         "Themed Style 2 - Accent 3"
      );
      n5(
         14,
         new com.aspose.slides.ms.System.o0(
            3798585374L, 48178, 16457, (short)-76, (short)99, (short)92, (short)96, (short)-41, (short)-80, (short)-52, (short)-46
         ),
         "Themed Style 2 - Accent 4"
      );
      n5(
         15,
         new com.aspose.slides.ms.System.o0(
            847222715, (short)-14285, (short)20407, (byte)-67, (byte)-27, (byte)63, (byte)112, (byte)117, (byte)3, (byte)70, (byte)-112
         ),
         "Themed Style 2 - Accent 5"
      );
      n5(
         16,
         new com.aspose.slides.ms.System.o0(
            1670060117, (short)7029, (short)20414, (byte)-109, (byte)12, (byte)57, (byte)-117, (byte)-88, (byte)-62, (byte)83, (byte)-58
         ),
         "Themed Style 2 - Accent 6"
      );
      n5(
         17,
         new com.aspose.slides.ms.System.o0(
            2642093765L, 16647, 20460, (short)-82, (short)-36, (short)23, (short)22, (short)-78, (short)80, (short)-95, (short)-17
         ),
         "Light Style 1"
      );
      n5(
         18,
         new com.aspose.slides.ms.System.o0(
            994810032, (short)24748, (short)17090, (byte)-81, (byte)-91, (byte)-75, (byte)-116, (byte)-41, (byte)127, (byte)-95, (byte)-27
         ),
         "Light Style 1 - Accent 1"
      );
      n5(
         19,
         new com.aspose.slides.ms.System.o0(
            239066693, (short)-20617, (short)19292, (byte)-105, (byte)21, (byte)73, (byte)-43, (byte)-108, (byte)-67, (byte)-16, (byte)94
         ),
         "Light Style 1 - Accent 2"
      );
      n5(
         20,
         new com.aspose.slides.ms.System.o0(
            3229869795L, 64125, 19835, (short)-91, (short)-107, (short)-17, (short)-110, (short)37, (short)-81, (short)-22, (short)-126
         ),
         "Light Style 1 - Accent 3"
      );
      n5(
         21,
         new com.aspose.slides.ms.System.o0(
            3530621609L, 33552, 18277, (short)-87, (short)53, (short)-95, (short)-111, (short)27, (short)0, (short)-54, (short)85
         ),
         "Light Style 1 - Accent 4"
      );
      n5(
         22,
         new com.aspose.slides.ms.System.o0(
            1511069973, (short)-16842, (short)19969, (byte)-89, (byte)-27, (byte)4, (byte)-79, (byte)103, (byte)46, (byte)-83, (byte)50
         ),
         "Light Style 2 - Accent 5"
      );
      n5(
         23,
         new com.aspose.slides.ms.System.o0(
            1758605555, (short)-12416, (short)18521, (byte)-116, (byte)-25, (byte)-92, (byte)62, (byte)-24, (byte)25, (byte)-109, (byte)-75
         ),
         "Light Style 1 - Accent 6"
      );
      n5(
         24,
         new com.aspose.slides.ms.System.o0(
            2123774420, (short)-7198, (short)19764, (byte)-110, (byte)-124, (byte)90, (byte)33, (byte)-107, (byte)-77, (byte)-48, (byte)-41
         ),
         "Light Style 2"
      );
      n5(
         25,
         new com.aspose.slides.ms.System.o0(
            1761685197, (short)20988, (short)16881, (byte)-86, (byte)-115, (byte)27, (byte)36, (byte)-125, (byte)-51, (byte)102, (byte)62
         ),
         "Light Style 2 - Accent 1"
      );
      n5(
         26,
         new com.aspose.slides.ms.System.o0(
            1921202178, (short)-271, (short)19577, (byte)-115, (byte)93, (byte)20, (byte)-49, (byte)30, (byte)-81, (byte)-104, (byte)-39
         ),
         "Light Style 2 - Accent 2"
      );
      n5(
         27,
         new com.aspose.slides.ms.System.o0(
            4074660821L, 39290, 17990, (short)-93, (short)119, (short)71, (short)2, (short)103, (short)58, (short)114, (short)-115
         ),
         "Light Style 2 - Accent 3"
      );
      n5(
         28,
         new com.aspose.slides.ms.System.o0(
            4121631849L, 28379, 20468, (short)-104, (short)63, (short)24, (short)-67, (short)33, (short)-98, (short)-13, (short)34
         ),
         "Medium Style 2 - Accent 3"
      );
      n5(
         29,
         new com.aspose.slides.ms.System.o0(
            10574933, (short)-31465, (short)17066, (byte)-74, (byte)20, (byte)-23, (byte)-71, (byte)73, (byte)16, (byte)-29, (byte)-109
         ),
         "Medium Style 2 - Accent 4"
      );
      n5(
         30,
         new com.aspose.slides.ms.System.o0(
            2112980608, (short)-8108, (short)16813, (byte)-117, (byte)-63, (byte)-47, (byte)-82, (byte)-9, (byte)114, (byte)68, (byte)13
         ),
         "Medium Style 2 - Accent 5"
      );
      n5(
         31,
         new com.aspose.slides.ms.System.o0(
            2435615877L, 20976, 18718, (short)-105, (short)116, (short)57, (short)0, (short)-81, (short)-17, (short)15, (short)-41
         ),
         "Light Style 2 - Accent 6"
      );
      n5(
         32,
         new com.aspose.slides.ms.System.o0(
            388573742, (short)-3277, (short)17403, (byte)-106, (byte)33, (byte)92, (byte)-69, (byte)-25, (byte)-3, (byte)-51, (byte)-53
         ),
         "Light Style 2 - Accent 4"
      );
      n5(
         33,
         new com.aspose.slides.ms.System.o0(
            1634574864, (short)-1189, (short)16728, (byte)-75, (byte)-32, (byte)-2, (byte)-73, (byte)51, (byte)-12, (byte)25, (byte)-70
         ),
         "Light Style 3"
      );
      n5(
         34,
         new com.aspose.slides.ms.System.o0(
            3163156374L, 36074, 18175, (short)-122, (short)-60, (short)76, (short)-32, (short)-25, (short)96, (short)-104, (short)2
         ),
         "Light Style 3 - Accent 1"
      );
      n5(
         35,
         new com.aspose.slides.ms.System.o0(
            568635044, (short)-29190, (short)19081, (byte)-121, (byte)-21, (byte)73, (byte)-61, (byte)38, (byte)98, (byte)-81, (byte)-32
         ),
         "Medium Style 2 - Accent 2"
      );
      n5(
         36,
         new com.aspose.slides.ms.System.o0(
            1570995584, (short)25652, (short)17616, (byte)-96, (byte)40, (byte)27, (byte)34, (byte)-90, (byte)-106, (byte)0, (byte)111
         ),
         "Light Style 3 - Accent 2"
      );
      n5(
         37,
         new com.aspose.slides.ms.System.o0(
            2274996795L, 60547, 18054, (short)-77, (short)10, (short)81, (short)36, (short)19, (short)-75, (short)-26, (short)122
         ),
         "Light Style 3 - Accent 3"
      );
      n5(
         38,
         new com.aspose.slides.ms.System.o0(
            3976739558L, 18170, 19033, (short)-113, (short)-80, (short)-97, (short)-105, (short)-21, (short)16, (short)113, (short)-97
         ),
         "Light Style 3 - Accent 4"
      );
      n5(
         39,
         new com.aspose.slides.ms.System.o0(
            3183400297L, 18327, 19953, (short)-96, (short)-12, (short)106, (short)-85, (short)60, (short)-39, (short)-126, (short)-40
         ),
         "Light Style 3 - Accent 5"
      );
      n5(
         40,
         new com.aspose.slides.ms.System.o0(
            3903914796L, 59960, 20229, (short)-70, (short)13, (short)56, (short)-81, (short)-1, (short)-57, (short)-66, (short)-45
         ),
         "Light Style 3 - Accent 6"
      );
      n5(
         41,
         new com.aspose.slides.ms.System.o0(
            2034074063, (short)-27406, (short)16410, (byte)-70, (byte)87, (byte)-110, (byte)-11, (byte)-89, (byte)-78, (byte)-48, (byte)-59
         ),
         "Medium Style 1"
      );
      n5(
         42,
         new com.aspose.slides.ms.System.o0(
            3003234337L, 41471, 16759, (short)-82, (short)-25, (short)118, (short)-46, (short)18, (short)25, (short)26, (short)9
         ),
         "Medium Style 1 - Accent 1"
      );
      n5(
         43,
         new com.aspose.slides.ms.System.o0(
            2647325165L, 2012, 18961, (short)-115, (short)127, (short)87, (short)-77, (short)92, (short)37, (short)104, (short)46
         ),
         "Medium Style 1 - Accent 2"
      );
      n5(
         44,
         new com.aspose.slides.ms.System.o0(
            535606488, (short)-9470, (short)19910, (byte)-96, (byte)-94, (byte)79, (byte)46, (byte)-70, (byte)-31, (byte)-36, (byte)-112
         ),
         "Medium Style 1 - Accent 3"
      );
      n5(
         45,
         new com.aspose.slides.ms.System.o0(
            504830259, (short)17945, (short)19985, (byte)-102, (byte)63, (byte)-9, (byte)96, (byte)-115, (byte)-9, (byte)95, (byte)-128
         ),
         "Medium Style 1 - Accent 4"
      );
      n5(
         46,
         new com.aspose.slides.ms.System.o0(
            4206874403L, 15209, 18063, (short)-74, (short)-97, (short)-120, (short)-10, (short)-34, (short)106, (short)114, (short)-14
         ),
         "Medium Style 1 - Accent 5"
      );
      n5(
         47,
         new com.aspose.slides.ms.System.o0(
            279033301, (short)-25703, (short)19509, (byte)-92, (byte)34, (byte)41, (byte)-110, (byte)116, (byte)-56, (byte)118, (byte)99
         ),
         "Medium Style 1 - Accent 6"
      );
      n5(
         48,
         new com.aspose.slides.ms.System.o0(
            2468964368L, 43141, 19427, (short)-93, (short)-25, (short)109, (short)91, (short)-18, (short)-91, (short)-113, (short)53
         ),
         "Medium Style 2 - Accent 6"
      );
      n5(
         49,
         new com.aspose.slides.ms.System.o0(
            2395082293L, 41334, 16402, (short)-68, (short)94, (short)-109, (short)92, (short)-1, (short)-8, (short)112, (short)-114
         ),
         "Medium Style 3"
      );
      n5(
         50,
         new com.aspose.slides.ms.System.o0(
            1847977545, (short)16150, (short)19970, (byte)-89, (byte)51, (byte)25, (byte)-46, (byte)-51, (byte)-65, (byte)72, (byte)-16
         ),
         "Medium Style 3 - Accent 1"
      );
      n5(
         51,
         new com.aspose.slides.ms.System.o0(
            2243831356L, 56279, 18976, (short)-69, (short)89, (short)-86, (short)-77, (short)10, (short)-54, (short)-90, (short)90
         ),
         "Medium Style 3 - Accent 2"
      );
      n5(
         52,
         new com.aspose.slides.ms.System.o0(
            3946073476L, 39675, 18814, (short)-93, (short)-109, (short)-36, (short)51, (short)107, (short)-95, (short)-99, (short)46
         ),
         "Medium Style 3 - Accent 3"
      );
      n5(
         53,
         new com.aspose.slides.ms.System.o0(
            3952488885L, 30962, 16841, (short)-122, (short)-101, (short)-97, (short)57, (short)6, (short)111, (short)-127, (short)4
         ),
         "Medium Style 3 - Accent 4"
      );
      n5(
         54,
         new com.aspose.slides.ms.System.o0(
            1958848675, (short)12394, (short)20151, (byte)-90, (byte)-79, (byte)79, (byte)126, (byte)14, (byte)-71, (byte)-59, (byte)-42
         ),
         "Medium Style 3 - Accent 5"
      );
      n5(
         55,
         new com.aspose.slides.ms.System.o0(
            709395234, (short)-3398, (short)19291, (byte)-105, (byte)72, (byte)13, (byte)71, (byte)66, (byte)113, (byte)-128, (byte)-113
         ),
         "Medium Style 3 - Accent 6"
      );
      n5(
         56,
         new com.aspose.slides.ms.System.o0(3618389194L, 51095, 18577, (short)-66, (short)2, (short)-39, (short)78, (short)67, (short)66, (short)91, (short)120),
         "Medium Style 4"
      );
      n5(
         57,
         new com.aspose.slides.ms.System.o0(
            1775180466, (short)6518, (short)17666, (byte)-65, (byte)54, (byte)63, (byte)-11, (byte)-22, (byte)33, (byte)-120, (byte)97
         ),
         "Medium Style 4 - Accent 1"
      );
      n5(
         58,
         new com.aspose.slides.ms.System.o0(
            2316335190L, 21844, 17147, (short)-80, (short)62, (short)57, (short)-11, (short)-37, (short)-61, (short)112, (short)-70
         ),
         "Medium Style 4 - Accent 2"
      );
      n5(
         59,
         new com.aspose.slides.ms.System.o0(
            84272111, (short)26602, (short)17259, (byte)-105, (byte)-78, (byte)1, (byte)36, (byte)-64, (byte)110, (byte)-67, (byte)36
         ),
         "Medium Style 4 - Accent 3"
      );
      n5(
         60,
         new com.aspose.slides.ms.System.o0(3299939690L, 14350, 20344, (short)-67, (short)-11, (short)-90, (short)6, (short)-88, (short)8, (short)59, (short)-7),
         "Medium Style 4 - Accent 4"
      );
      n5(
         61,
         new com.aspose.slides.ms.System.o0(
            579046383, (short)-29774, (short)17560, (byte)-124, (byte)-89, (byte)-59, (byte)-123, (byte)31, (byte)89, (byte)61, (byte)-15
         ),
         "Medium Style 4 - Accent 5"
      );
      n5(
         62,
         new com.aspose.slides.ms.System.o0(
            383383150, (short)24249, (short)18562, (byte)-122, (byte)-5, (byte)-36, (byte)-65, (byte)53, (byte)-29, (byte)-61, (byte)-28
         ),
         "Medium Style 4 - Accent 6"
      );
      n5(
         63,
         new com.aspose.slides.ms.System.o0(
            3892530808L, 32605, 19502, (short)-77, (short)117, (short)-4, (short)100, (short)-78, (short)123, (short)-55, (short)23
         ),
         "Dark Style 1"
      );
      n5(
         64,
         new com.aspose.slides.ms.System.o0(
            308170870, (short)14352, (short)18397, (byte)-73, (byte)-97, (byte)103, (byte)77, (byte)122, (byte)-44, (byte)12, (byte)1
         ),
         "Dark Style 1 - Accent 1"
      );
      n5(
         65,
         new com.aspose.slides.ms.System.o0(
            936281331, (short)10435, (short)17470, (byte)-98, (byte)-106, (byte)-103, (byte)-49, (byte)-126, (byte)81, (byte)43, (byte)120
         ),
         "Dark Style 1 - Accent 2"
      );
      n5(
         66,
         new com.aspose.slides.ms.System.o0(
            3493087163L, 23911, 18795, (short)-114, (short)-121, (short)-27, (short)97, (short)7, (short)90, (short)-43, (short)92
         ),
         "Dark Style 1 - Accent 3"
      );
      n5(
         67,
         new com.aspose.slides.ms.System.o0(
            3911842292L, 19087, 17190, (short)-95, (short)-76, (short)34, (short)-124, (short)-105, (short)19, (short)-35, (short)-85
         ),
         "Dark Style 1 - Accent 4"
      );
      n5(
         68,
         new com.aspose.slides.ms.System.o0(
            2413052990L, 63881, 20420, (short)-96, (short)-56, (short)-43, (short)-94, (short)-81, (short)31, (short)57, (short)11
         ),
         "Dark Style 1 - Accent 5"
      );
      n5(
         69,
         new com.aspose.slides.ms.System.o0(
            2942330963L, 30321, 18794, (short)-114, (short)79, (short)-33, (short)113, (short)-8, (short)-20, (short)-111, (short)-117
         ),
         "Dark Style 1 - Accent 6"
      );
      n5(
         70,
         new com.aspose.slides.ms.System.o0(
            1375908042, (short)-940, (short)17558, (byte)-117, (byte)-54, (byte)94, (byte)-10, (byte)106, (byte)-127, (byte)-115, (byte)41
         ),
         "Dark Style 2"
      );
      n5(
         71,
         new com.aspose.slides.ms.System.o0(
            107000840, (short)-19505, (short)19092, (byte)-123, (byte)-4, (byte)43, (byte)30, (byte)10, (byte)69, (byte)-12, (byte)-94
         ),
         "Dark Style 2 - Accent 1/Accent 2"
      );
      n5(
         72,
         new com.aspose.slides.ms.System.o0(
            2448145356L, 56018, 17820, (short)-66, (short)46, (short)-10, (short)-34, (short)53, (short)-49, (short)-102, (short)40
         ),
         "Dark Style 2 - Accent 3/Accent 4"
      );
      n5(
         73,
         new com.aspose.slides.ms.System.o0(
            1190695081, (short)10247, (short)20155, (byte)-72, (byte)29, (byte)-78, (byte)-86, (byte)120, (byte)-20, (byte)127, (byte)57
         ),
         "Dark Style 2 - Accent 5/Accent 6"
      );
      n5(
         74,
         new com.aspose.slides.ms.System.o0(
            1607530577, (short)-5030, (short)19768, (byte)-80, (byte)-83, (byte)-128, (byte)-109, (byte)-20, (byte)16, (byte)-13, (byte)56
         ),
         "Light Style 1 - Accent 5"
      );
   }
}
