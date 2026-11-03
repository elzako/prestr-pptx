package com.aspose.slides.internal.x7n;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.h2;
import com.aspose.slides.ms.System.v4;
import com.aspose.slides.ms.System.y8;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map.Entry;

public class l6 implements h2, v4, Cloneable {
   private static HashMap k5 = new HashMap();
   private static HashMap u3 = new HashMap();
   private static final Object a6 = new Object();
   private t4 u9;
   private t4[] h0;
   e2 n5 = null;
   n5 l6;
   private String c8;
   private Boolean t2;
   private boolean s7 = false;
   private boolean x8 = true;
   private Locale n3 = null;
   private u3 y4 = null;
   private Integer e2 = -1;
   private s7 t9;
   private boolean z1 = true;
   private static l6 t4;
   private static HashMap<String, Integer> q0 = new HashMap<>();
   private static HashSet<Integer> z3;
   private static HashMap<Integer, e2$n5> m1;

   private l6() {
   }

   public l6(int var1) {
      this(var1, true);
   }

   public l6(int var1, boolean var2) {
      this.c8 = l6(var1);
      this.e2 = var1;
      this.t2 = var2;
      if (k5(this.e2)) {
         this.n5(this.e2);
      } else {
         throw new ArgumentException(d1.n5("Culture ID: {0} is not a supported culture", new Object[]{this.e2}));
      }
   }

   public l6(String var1) {
      this(var1, true);
   }

   public l6(String var1, boolean var2) {
      this.c8 = var1;
      this.t2 = var2;
      this.e2 = k5(var1);
      if (k5(this.e2)) {
         this.n5(this.e2);
      } else {
         throw new ArgumentException(d1.n5("Culture ID: {0} is not a supported culture", new Object[]{this.e2}));
      }
   }

   l6(boolean var1, String var2) {
      this.x8 = var1;
      this.c8 = var2;
      this.t2 = true;
      this.e2 = k5(var2);
      if (k5(this.e2)) {
         this.n5(this.e2);
      } else {
         throw new ArgumentException("Culture ID: " + this.e2 + " is not a supported culture");
      }
   }

   private void n5(int var1) {
      this.u9 = com.aspose.slides.internal.o3n.u3.k5(var1);
      this.z1 = this.u3(var1);
      if (this.z1 && !this.x8) {
         var1 = com.aspose.slides.internal.o3n.u3.n5(var1);
      }

      if (!this.z1 || !this.x8) {
         this.t9 = new s7(var1, false);
         this.y4 = new u3(false);
         com.aspose.slides.internal.o3n.k5 var2 = com.aspose.slides.internal.o3n.u3.l6(var1);
         this.y4.a6(var2.u3.l6);
         this.y4.u3(var2.u3.n5);
         this.y4.y4(var2.u3.k5);
         this.y4.e2(var2.u3.u3);
         this.y4.n5(var2.u3.a6);
         this.y4.t2(var2.u3.u9);
         this.y4.k5(var2.u3.h0);
         this.y4.a6(var2.u3.c8);
         this.y4.s7(var2.u3.t2);
         this.y4.h0(var2.u3.s7);
         this.y4.x8(var2.u3.x8);
         this.y4.n5(var2.u3.n3);
         this.y4.l6(var2.u3.y4);
         this.y4.k5(var2.u3.e2);
         this.y4.u3(var2.u3.t9);
         this.y4.x8(var2.u3.z1);
         this.y4.a6(var2.u3.t4);
         this.y4.c8(var2.u3.q0);
         this.y4.u9(var2.u3.z3);
         this.y4.h0(var2.u3.m1);
         this.y4.n3(var2.u3.k7);
         this.y4.e2(var2.u3.z8);
         this.y4.y4(var2.u3.m3);
         this.y4.t2(var2.u3.j5);
         this.y4.s7(var2.u3.w1);
         this.y4.n3(var2.u3.r4);
         this.y4.n5(var2.u3.c4);
         this.y4.c8(this.e2);
      }
   }

   private static void n5(int var0, int var1, int var2, int var3, int var4, char var5, boolean var6) {
      e2$n5 var7 = new e2$n5(var1, var2, var3, var4, var5);
      m1.put(var0, var7);
   }

   private static String l6(int var0) {
      if (var0 < 0) {
         throw new ArgumentOutOfRangeException("Positive number required");
      }

      if (z3.contains(var0)) {
         for (Entry var2 : q0.entrySet()) {
            if ((Integer)var2.getValue() == var0) {
               return (String)var2.getKey();
            }
         }
      }

      throw new ArgumentException(d1.n5("Culture ID: {0} is not a supported culture", new Object[]{var0}));
   }

   private static int k5(String var0) {
      Integer var1 = null;
      if (var0 == null) {
         throw new ArgumentNullException("name");
      }

      if (var0.length() == 0) {
         return 127;
      }

      var1 = q0.get(var0);
      if (var1 == null) {
         for (String var3 : q0.keySet()) {
            if (var3.equalsIgnoreCase(var0)) {
               var1 = q0.get(var3);
            }
         }
      }

      if (var1 == null) {
         throw new ArgumentException(d1.n5("Culture Name: {0} is not a supported culture", new Object[]{var0}));
      } else {
         return var1;
      }
   }

   public t4 n5() {
      if (this.u9 == null) {
         this.u9 = com.aspose.slides.internal.o3n.u3.k5(this.t2());
      }

      return this.u9;
   }

   public static l6 l6() {
      return com.aspose.slides.internal.r5t.t2.n5().h0();
   }

   public static l6 k5() {
      return t4;
   }

   public static l6 u3() {
      return com.aspose.slides.internal.r5t.t2.n5().u9();
   }

   public u3 a6() {
      if (this.y4 != null) {
         return this.y4;
      }

      int var1 = this.t2();
      u3 var2 = new u3();
      if (!this.h0() && k5(this.t2())) {
         com.aspose.slides.internal.o3n.k5 var3 = com.aspose.slides.internal.o3n.u3.l6(var1);
         var2.a6(var3.u3.l6);
         var2.u3(var3.u3.n5);
         var2.y4(var3.u3.k5);
         var2.e2(var3.u3.u3);
         var2.n5(var3.u3.a6);
         var2.t2(var3.u3.u9);
         var2.k5(var3.u3.h0);
         var2.a6(var3.u3.c8);
         var2.s7(var3.u3.t2);
         var2.h0(var3.u3.s7);
         var2.x8(var3.u3.x8);
         var2.n5(var3.u3.n3);
         var2.l6(var3.u3.y4);
         var2.k5(var3.u3.e2);
         var2.u3(var3.u3.t9);
         var2.x8(var3.u3.z1);
         var2.a6(var3.u3.t4);
         var2.c8(var3.u3.q0);
         var2.u9(var3.u3.z3);
         var2.h0(var3.u3.m1);
         var2.n3(var3.u3.k7);
         var2.e2(var3.u3.z8);
         var2.y4(var3.u3.m3);
         var2.t2(var3.u3.j5);
         var2.s7(var3.u3.w1);
         var2.n3(var3.u3.r4);
         var2.n5(var3.u3.c4);
      }

      var2.c8(var1);
      this.y4 = var2;
      return var2;
   }

   private static boolean k5(int var0) {
      int[] var1 = new int[]{
         1,
         2,
         3,
         4,
         5,
         6,
         7,
         8,
         9,
         10,
         11,
         12,
         13,
         14,
         15,
         16,
         17,
         18,
         19,
         20,
         21,
         22,
         24,
         25,
         26,
         27,
         28,
         29,
         30,
         31,
         32,
         33,
         34,
         35,
         36,
         37,
         38,
         39,
         41,
         42,
         43,
         44,
         45,
         47,
         54,
         55,
         56,
         57,
         62,
         63,
         64,
         65,
         67,
         68,
         70,
         71,
         73,
         74,
         75,
         78,
         79,
         80,
         86,
         87,
         90,
         101,
         127,
         1025,
         1026,
         1027,
         1028,
         1029,
         1030,
         1031,
         1032,
         1033,
         1034,
         1035,
         1036,
         1037,
         1038,
         1039,
         1040,
         1041,
         1042,
         1043,
         1044,
         1045,
         1046,
         1047,
         1048,
         1049,
         1050,
         1051,
         1052,
         1053,
         1054,
         1055,
         1056,
         1057,
         1058,
         1059,
         1060,
         1061,
         1062,
         1063,
         1064,
         1065,
         1066,
         1067,
         1068,
         1069,
         1070,
         1071,
         1074,
         1076,
         1077,
         1078,
         1079,
         1080,
         1081,
         1082,
         1083,
         1086,
         1087,
         1088,
         1089,
         1090,
         1091,
         1092,
         1093,
         1094,
         1095,
         1096,
         1097,
         1098,
         1099,
         1100,
         1101,
         1102,
         1103,
         1104,
         1105,
         1106,
         1107,
         1108,
         1110,
         1111,
         1114,
         1115,
         1117,
         1118,
         1121,
         1122,
         1123,
         1124,
         1125,
         1128,
         1130,
         1131,
         1132,
         1133,
         1134,
         1135,
         1136,
         1144,
         1146,
         1148,
         1150,
         1152,
         1153,
         1154,
         1155,
         1156,
         1157,
         1158,
         1159,
         1160,
         1164,
         1169,
         2049,
         2052,
         2055,
         2057,
         2058,
         2060,
         2064,
         2067,
         2068,
         2070,
         2074,
         2077,
         2092,
         2094,
         2107,
         2108,
         2110,
         2115,
         2117,
         2128,
         2141,
         2143,
         2155,
         3073,
         3076,
         3079,
         3081,
         3082,
         3084,
         3098,
         3131,
         3179,
         4097,
         4100,
         4103,
         4105,
         4106,
         4108,
         4122,
         4155,
         5121,
         5124,
         5127,
         5129,
         5130,
         5132,
         5146,
         5179,
         6145,
         6153,
         6154,
         6156,
         6170,
         6203,
         7169,
         7177,
         7178,
         7194,
         7227,
         8193,
         8201,
         8202,
         8218,
         8251,
         9217,
         9225,
         9226,
         9242,
         9275,
         10241,
         10249,
         10250,
         10266,
         11265,
         11273,
         11274,
         11290,
         12289,
         12297,
         12298,
         12314,
         13313,
         13321,
         13322,
         14337,
         14346,
         15361,
         15370,
         16385,
         16393,
         16394,
         17417,
         17418,
         18441,
         18442,
         19466,
         20490,
         21514,
         31748,
         31770
      };

      for (int var5 : var1) {
         if (var0 == var5) {
            return true;
         }
      }

      return false;
   }

   public void n5(u3 var1) {
      this.y4 = var1;
   }

   public void n5(s7 var1) {
      this.t9 = var1;
   }

   public String u9() {
      Locale var1 = n5(this);
      return var1.getDisplayLanguage(Locale.ENGLISH) + " (" + var1.getDisplayCountry(Locale.ENGLISH) + ")";
   }

   private boolean u3(int var1) {
      int[] var2 = new int[]{
         1,
         2,
         3,
         4,
         5,
         6,
         7,
         8,
         9,
         10,
         11,
         12,
         13,
         14,
         15,
         16,
         17,
         18,
         19,
         20,
         21,
         22,
         24,
         25,
         26,
         27,
         28,
         29,
         30,
         31,
         32,
         33,
         34,
         35,
         36,
         37,
         38,
         39,
         41,
         42,
         43,
         44,
         45,
         47,
         54,
         55,
         56,
         57,
         62,
         63,
         64,
         65,
         67,
         68,
         70,
         71,
         73,
         74,
         75,
         78,
         79,
         80,
         86,
         87,
         90,
         101,
         31748,
         31770
      };

      for (int var6 : var2) {
         if (var1 == var6) {
            return true;
         }
      }

      return false;
   }

   public boolean h0() {
      return this.u3(this.t2());
   }

   public boolean c8() {
      return this.s7;
   }

   public int t2() {
      return this.e2;
   }

   public String s7() {
      return this.c8;
   }

   private static String l6(Locale var0) {
      String var1 = var0.toString().toLowerCase();
      String var2;
      if (var1.equals("ar_sd")) {
         var2 = "ar";
      } else if (var1.equals("el_cy")) {
         var2 = "el";
      } else if (var1.equals("en_mt")) {
         var2 = "en";
      } else if (var1.equals("ga")) {
         var2 = "ga-IE";
      } else if (var1.equals("iw")) {
         var2 = "he";
      } else if (var1.equals("iw_il")) {
         var2 = "he-IL";
      } else if (var1.equals("in")) {
         var2 = "id";
      } else if (var1.equals("in_id")) {
         var2 = "id-ID";
      } else if (var1.equals("ja_jp_jp")) {
         var2 = "ja-JP";
      } else if (var1.equals("ja_jp_jp_#u-ca-japanese")) {
         var2 = "ja-JP";
      } else if (var1.equals("mt")) {
         var2 = "mt-MT";
      } else if (var1.equals("no_no") || var1.equals("no_no_ny")) {
         var2 = "no";
      } else if (var1.equals("sh") || var1.equals("sh_yu") || var1.equals("sr__#latn") || var1.equals("sr_yu")) {
         var2 = "sr";
      } else if (var1.equals("sr_ba_#latn")) {
         var2 = "sr-Latn-BA";
      } else if (var1.equals("sr_me_#latn")) {
         var2 = "sr-Latn-ME";
      } else if (var1.equals("sr_rs_#latn")) {
         var2 = "sr-Latn-RS";
      } else if (var1.equals("th_th_th") || var1.equals("th_th_th_#u-nu-thai")) {
         var2 = "th-TH";
      } else if (var1.equals("zh")) {
         var2 = "zh-CN";
      } else {
         var2 = var0.toString().replace('_', '-');
      }

      return var2;
   }

   public t4[] x8() {
      if (this.h0 == null) {
         this.h0 = com.aspose.slides.internal.o3n.u3.u3(this.t2());
      }

      return this.h0;
   }

   public e2 n3() {
      if (this.n5 == null) {
         int var1 = this.t2();
         e2$n5 var2 = m1.get(var1);
         if (var2 == null) {
            throw new NullPointerException("textInfoData is null for " + this.s7());
         }

         this.n5 = new e2(this, var1, var2);
      }

      return this.n5;
   }

   public String y4() {
      Locale var1 = n5(this);
      return var1.getLanguage();
   }

   public static l6 n5(String var0) {
      return new l6(var0);
   }

   public static l6[] n5(l6[] var0) {
      ArrayList var1 = new ArrayList();

      for (Entry var3 : q0.entrySet()) {
         if (k5((Integer)var3.getValue())) {
            var1.add(new l6((String)var3.getKey(), !((String)var3.getKey()).equals("")));
         }
      }

      return (l6[])var1.toArray(new l6[0]);
   }

   private static s7 l6(l6 var0) {
      return new s7(var0.t2(), false);
   }

   public s7 e2() {
      if (this.h0() && this.x8) {
         throw new NotSupportedException(
            d1.n5(
               "Culture \"",
               this.s7(),
               "\" is ",
               "a neutral culture. It can not be used in formatting ",
               "and parsing and therefore cannot be set as the thread's ",
               "current culture."
            )
         );
      }

      if (this.t9 == null) {
         this.t9 = l6(this);
      }

      return this.t9;
   }

   @Override
   public String toString() {
      return this.s7();
   }

   @Override
   public boolean equals(Object object) {
      if (this == object) {
         return true;
      }

      if (object != null && this.getClass() == object.getClass()) {
         l6 var2 = (l6)object;
         boolean var3 = var2.t2() == this.t2() && var2.x8 == this.x8 && d1.a6(var2.c8, this.c8);
         if (var3 && (!this.h0() || !this.x8)) {
            var3 = this.e2().equals(var2.e2()) && this.a6().equals(var2.a6());
         }

         return var3;
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      int var1 = this.u9 != null ? this.u9.hashCode() : 0;
      var1 = 31 * var1 + (this.h0 != null ? Arrays.hashCode(this.h0) : 0);
      var1 = 31 * var1 + (this.n5 != null ? this.n5.hashCode() : 0);
      var1 = 31 * var1 + (this.l6 != null ? this.l6.hashCode() : 0);
      var1 = 31 * var1 + (this.c8 != null ? this.c8.hashCode() : 0);
      var1 = 31 * var1 + (this.t2 != null ? this.t2.hashCode() : 0);
      var1 = 31 * var1 + (this.s7 ? 1 : 0);
      var1 = 31 * var1 + (this.x8 ? 1 : 0);
      var1 = 31 * var1 + (this.n3 != null ? this.n3.hashCode() : 0);
      var1 = 31 * var1 + (this.y4 != null ? this.y4.hashCode() : 0);
      var1 = 31 * var1 + (this.e2 != null ? this.e2.hashCode() : 0);
      var1 = 31 * var1 + (this.t9 != null ? this.t9.hashCode() : 0);
      return 31 * var1 + (this.z1 ? 1 : 0);
   }

   public n5 t9() {
      if (this.l6 == null) {
         this.l6 = new n5(this);
      }

      return this.l6;
   }

   protected Object z1() {
      l6 var1 = new l6();
      var1.e2 = this.e2;
      var1.z1 = this.z1;
      var1.u9 = this.u9;
      var1.h0 = (t4[])this.x8().clone();
      var1.n5 = (e2)this.n3().clone();
      var1.c8 = this.s7();
      var1.t2 = this.t4();
      var1.x8 = this.x8;
      return var1;
   }

   @Override
   public Object deepClone() {
      l6 var1 = (l6)this.z1();
      if (!this.h0() || !this.x8) {
         var1.n5((s7)this.e2().deepClone());
         var1.n5((u3)this.a6().deepClone());
      }

      return var1;
   }

   @Override
   public Object n5(y8 var1) {
      h2 var2 = null;
      if (var1.k5(com.aspose.slides.internal.v6g.k5.n5(s7.class))) {
         var2 = this.e2();
      } else if (var1.k5(com.aspose.slides.internal.v6g.k5.n5(u3.class))) {
         var2 = this.a6();
      }

      return var2;
   }

   public boolean t4() {
      return this.t2 != null ? this.t2 : false;
   }

   public static l6 l6(String var0) {
      if (var0 == null) {
         throw new ArgumentNullException("name");
      }

      synchronized (a6) {
         l6 var2 = (l6)k5.get(var0.toLowerCase());
         if (var2 == null) {
            var2 = new l6(var0, false);
         }

         u3.put(var2.t2(), var2);
         k5.put(var0.toLowerCase(), var2);
         return var2;
      }
   }

   public static Locale n5(l6 var0) {
      if (var0 == null) {
         return null;
      }

      if (var0.n3 == null) {
         String var1 = "";
         String var2 = "";
         String var3 = "";
         int var4 = var0.c8.indexOf(45);
         if (var4 >= 0) {
            var1 = var0.c8.substring(0, var4);
            var2 = var0.c8.substring(var4 + 1);
            int var5 = var2.indexOf(45);
            if (var5 >= 0) {
               var3 = var2.substring(0, var5);
               var2 = var2.substring(var5 + 1);
            }
         } else {
            var1 = var0.c8;
         }

         var0.n3 = new Locale(var1, var2, var3);
      }

      return var0.n3;
   }

   public static l6 n5(Locale var0) {
      return var0 == null ? null : new l6(false, l6(var0));
   }

   static {
      q0.put("", 127);
      q0.put("af", 54);
      q0.put("af-ZA", 1078);
      q0.put("am-ET", 1118);
      q0.put("ar", 1);
      q0.put("ar-AE", 14337);
      q0.put("ar-BH", 15361);
      q0.put("ar-DZ", 5121);
      q0.put("ar-EG", 3073);
      q0.put("ar-IQ", 2049);
      q0.put("ar-JO", 11265);
      q0.put("ar-KW", 13313);
      q0.put("ar-LB", 12289);
      q0.put("ar-LY", 4097);
      q0.put("ar-MA", 6145);
      q0.put("arn-CL", 1146);
      q0.put("ar-OM", 8193);
      q0.put("ar-QA", 16385);
      q0.put("ar-SA", 1025);
      q0.put("ar-SY", 10241);
      q0.put("ar-TN", 7169);
      q0.put("ar-YE", 9217);
      q0.put("as-IN", 1101);
      q0.put("az", 44);
      q0.put("az-Cyrl-AZ", 2092);
      q0.put("az-Latn-AZ", 1068);
      q0.put("ba-RU", 1133);
      q0.put("be", 35);
      q0.put("be-BY", 1059);
      q0.put("bg", 2);
      q0.put("bg-BG", 1026);
      q0.put("bn-BD", 2117);
      q0.put("bn-IN", 1093);
      q0.put("bo-CN", 1105);
      q0.put("br-FR", 1150);
      q0.put("bs-Cyrl-BA", 8218);
      q0.put("bs-Latn-BA", 5146);
      q0.put("ca", 3);
      q0.put("ca-ES", 1027);
      q0.put("co-FR", 1155);
      q0.put("cs", 5);
      q0.put("cs-CZ", 1029);
      q0.put("cy-GB", 1106);
      q0.put("da", 6);
      q0.put("da-DK", 1030);
      q0.put("de", 7);
      q0.put("de-AT", 3079);
      q0.put("de-CH", 2055);
      q0.put("de-DE", 1031);
      q0.put("de-LI", 5127);
      q0.put("de-LU", 4103);
      q0.put("dsb-DE", 2094);
      q0.put("dv", 101);
      q0.put("dv-MV", 1125);
      q0.put("el", 8);
      q0.put("el-GR", 1032);
      q0.put("en", 9);
      q0.put("en-029", 9225);
      q0.put("en-AU", 3081);
      q0.put("en-BZ", 10249);
      q0.put("en-CA", 4105);
      q0.put("en-GB", 2057);
      q0.put("en-IE", 6153);
      q0.put("en-IN", 16393);
      q0.put("en-JM", 8201);
      q0.put("en-MY", 17417);
      q0.put("en-NZ", 5129);
      q0.put("en-PH", 13321);
      q0.put("en-SG", 18441);
      q0.put("en-TT", 11273);
      q0.put("en-US", 1033);
      q0.put("en-ZA", 7177);
      q0.put("en-ZW", 12297);
      q0.put("es", 10);
      q0.put("es-AR", 11274);
      q0.put("es-BO", 16394);
      q0.put("es-CL", 13322);
      q0.put("es-CO", 9226);
      q0.put("es-CR", 5130);
      q0.put("es-DO", 7178);
      q0.put("es-EC", 12298);
      q0.put("es-ES", 3082);
      q0.put("es-GT", 4106);
      q0.put("es-HN", 18442);
      q0.put("es-MX", 2058);
      q0.put("es-NI", 19466);
      q0.put("es-PA", 6154);
      q0.put("es-PE", 10250);
      q0.put("es-PR", 20490);
      q0.put("es-PY", 15370);
      q0.put("es-SV", 17418);
      q0.put("es-US", 21514);
      q0.put("es-UY", 14346);
      q0.put("es-VE", 8202);
      q0.put("et", 37);
      q0.put("et-EE", 1061);
      q0.put("eu", 45);
      q0.put("eu-ES", 1069);
      q0.put("fa", 41);
      q0.put("fa-IR", 1065);
      q0.put("fi", 11);
      q0.put("fi-FI", 1035);
      q0.put("fil-PH", 1124);
      q0.put("fo", 56);
      q0.put("fo-FO", 1080);
      q0.put("fr", 12);
      q0.put("fr-BE", 2060);
      q0.put("fr-CA", 3084);
      q0.put("fr-CH", 4108);
      q0.put("fr-FR", 1036);
      q0.put("fr-LU", 5132);
      q0.put("fr-MC", 6156);
      q0.put("fy-NL", 1122);
      q0.put("ga-IE", 2108);
      q0.put("gd-GB", 1169);
      q0.put("gl", 86);
      q0.put("gl-ES", 1110);
      q0.put("gsw-FR", 1156);
      q0.put("gu", 71);
      q0.put("gu-IN", 1095);
      q0.put("ha-Latn-NG", 1128);
      q0.put("he", 13);
      q0.put("he-IL", 1037);
      q0.put("hi", 57);
      q0.put("hi-IN", 1081);
      q0.put("hr", 26);
      q0.put("hr-BA", 4122);
      q0.put("hr-HR", 1050);
      q0.put("hsb-DE", 1070);
      q0.put("hu", 14);
      q0.put("hu-HU", 1038);
      q0.put("hy", 43);
      q0.put("hy-AM", 1067);
      q0.put("id", 33);
      q0.put("id-ID", 1057);
      q0.put("ig-NG", 1136);
      q0.put("ii-CN", 1144);
      q0.put("is", 15);
      q0.put("is-IS", 1039);
      q0.put("it", 16);
      q0.put("it-CH", 2064);
      q0.put("it-IT", 1040);
      q0.put("iu-Cans-CA", 1117);
      q0.put("iu-Latn-CA", 2141);
      q0.put("ja", 17);
      q0.put("ja-JP", 1041);
      q0.put("ka", 55);
      q0.put("ka-GE", 1079);
      q0.put("kk", 63);
      q0.put("kk-KZ", 1087);
      q0.put("kl-GL", 1135);
      q0.put("km-KH", 1107);
      q0.put("kn", 75);
      q0.put("kn-IN", 1099);
      q0.put("ko", 18);
      q0.put("kok", 87);
      q0.put("kok-IN", 1111);
      q0.put("ko-KR", 1042);
      q0.put("ky", 64);
      q0.put("ky-KG", 1088);
      q0.put("lb-LU", 1134);
      q0.put("lo-LA", 1108);
      q0.put("lt", 39);
      q0.put("lt-LT", 1063);
      q0.put("lv", 38);
      q0.put("lv-LV", 1062);
      q0.put("mi-NZ", 1153);
      q0.put("mk", 47);
      q0.put("mk-MK", 1071);
      q0.put("ml-IN", 1100);
      q0.put("mn", 80);
      q0.put("mn-MN", 1104);
      q0.put("mn-Mong-CN", 2128);
      q0.put("moh-CA", 1148);
      q0.put("mr", 78);
      q0.put("mr-IN", 1102);
      q0.put("ms", 62);
      q0.put("ms-BN", 2110);
      q0.put("ms-MY", 1086);
      q0.put("mt-MT", 1082);
      q0.put("nb-NO", 1044);
      q0.put("ne-NP", 1121);
      q0.put("nl", 19);
      q0.put("nl-BE", 2067);
      q0.put("nl-NL", 1043);
      q0.put("nn-NO", 2068);
      q0.put("no", 20);
      q0.put("ns-ZA", 1132);
      q0.put("nso-ZA", 1132);
      q0.put("oc-FR", 1154);
      q0.put("or-IN", 1096);
      q0.put("pa", 70);
      q0.put("pa-IN", 1094);
      q0.put("pl", 21);
      q0.put("pl-PL", 1045);
      q0.put("prs-AF", 1164);
      q0.put("ps-AF", 1123);
      q0.put("pt", 22);
      q0.put("pt-BR", 1046);
      q0.put("pt-PT", 2070);
      q0.put("qut-GT", 1158);
      q0.put("quz-BO", 1131);
      q0.put("quz-EC", 2155);
      q0.put("quz-PE", 3179);
      q0.put("rm-CH", 1047);
      q0.put("ro", 24);
      q0.put("ro-RO", 1048);
      q0.put("ru", 25);
      q0.put("ru-RU", 1049);
      q0.put("rw-RW", 1159);
      q0.put("sa", 79);
      q0.put("sah-RU", 1157);
      q0.put("sa-IN", 1103);
      q0.put("se-FI", 3131);
      q0.put("se-NO", 1083);
      q0.put("se-SE", 2107);
      q0.put("si-LK", 1115);
      q0.put("sk", 27);
      q0.put("sk-SK", 1051);
      q0.put("sl", 36);
      q0.put("sl-SI", 1060);
      q0.put("sma-NO", 6203);
      q0.put("sma-SE", 7227);
      q0.put("smj-NO", 4155);
      q0.put("smj-SE", 5179);
      q0.put("smn-FI", 9275);
      q0.put("sms-FI", 8251);
      q0.put("sq", 28);
      q0.put("sq-AL", 1052);
      q0.put("sr", 31770);
      q0.put("sr-Cyrl-BA", 7194);
      q0.put("sr-Cyrl-CS", 3098);
      q0.put("sr-Cyrl-ME", 12314);
      q0.put("sr-Cyrl-RS", 10266);
      q0.put("sr-Latn-BA", 6170);
      q0.put("sr-Latn-CS", 2074);
      q0.put("sr-Latn-ME", 11290);
      q0.put("sr-Latn-RS", 9242);
      q0.put("sv", 29);
      q0.put("sv-FI", 2077);
      q0.put("sv-SE", 1053);
      q0.put("sw", 65);
      q0.put("sw-KE", 1089);
      q0.put("syr", 90);
      q0.put("syr-SY", 1114);
      q0.put("ta", 73);
      q0.put("ta-IN", 1097);
      q0.put("te", 74);
      q0.put("te-IN", 1098);
      q0.put("tg-Cyrl-TJ", 1064);
      q0.put("th", 30);
      q0.put("th-TH", 1054);
      q0.put("tk-TM", 1090);
      q0.put("tn-ZA", 1074);
      q0.put("tr", 31);
      q0.put("tr-TR", 1055);
      q0.put("tt", 68);
      q0.put("tt-RU", 1092);
      q0.put("tzm-Latn-DZ", 2143);
      q0.put("ug-CN", 1152);
      q0.put("uk", 34);
      q0.put("uk-UA", 1058);
      q0.put("ur", 32);
      q0.put("ur-PK", 1056);
      q0.put("uz", 67);
      q0.put("uz-Cyrl-UZ", 2115);
      q0.put("uz-Latn-UZ", 1091);
      q0.put("vi", 42);
      q0.put("vi-VN", 1066);
      q0.put("wo-SN", 1160);
      q0.put("xh-ZA", 1076);
      q0.put("yo-NG", 1130);
      q0.put("zh-CHS", 4);
      q0.put("zh-CHT", 31748);
      q0.put("zh-CN", 2052);
      q0.put("zh-HK", 3076);
      q0.put("zh-MO", 5124);
      q0.put("zh-SG", 4100);
      q0.put("zh-TW", 1028);
      q0.put("zu-ZA", 1077);
      z3 = new HashSet<>(q0.values());
      m1 = new HashMap<>();
      n5(127, 1252, 37, 10000, 437, ',', false);
      n5(54, 1252, 500, 10000, 850, ',', false);
      n5(1078, 1252, 500, 10000, 850, ',', false);
      n5(1118, 0, 500, 2, 1, '፣', false);
      n5(1, 1256, 20420, 10004, 720, ';', true);
      n5(14337, 1256, 20420, 10004, 720, ';', true);
      n5(15361, 1256, 20420, 10004, 720, ';', true);
      n5(5121, 1256, 20420, 10004, 720, ';', true);
      n5(3073, 1256, 20420, 10004, 720, ';', true);
      n5(2049, 1256, 20420, 10004, 720, ';', true);
      n5(11265, 1256, 20420, 10004, 720, ';', true);
      n5(13313, 1256, 20420, 10004, 720, ';', true);
      n5(12289, 1256, 20420, 10004, 720, ';', true);
      n5(4097, 1256, 20420, 10004, 720, ';', true);
      n5(6145, 1256, 20420, 10004, 720, ';', true);
      n5(1146, 1252, 20284, 10000, 850, ',', false);
      n5(8193, 1256, 20420, 10004, 720, ';', true);
      n5(16385, 1256, 20420, 10004, 720, ';', true);
      n5(1025, 1256, 20420, 10004, 720, ';', true);
      n5(10241, 1256, 20420, 10004, 720, ';', true);
      n5(7169, 1256, 20420, 10004, 720, ';', true);
      n5(9217, 1256, 20420, 10004, 720, ';', true);
      n5(1101, 0, 500, 2, 1, ',', false);
      n5(44, 1254, 20905, 10081, 857, ';', false);
      n5(2092, 1251, 20880, 10007, 866, ';', false);
      n5(1068, 1254, 20905, 10081, 857, ';', false);
      n5(1133, 1251, 20880, 10007, 866, ';', false);
      n5(35, 1251, 500, 10007, 866, ';', false);
      n5(1059, 1251, 500, 10007, 866, ';', false);
      n5(2, 1251, 20420, 10007, 866, ';', false);
      n5(1026, 1251, 20420, 10007, 866, ';', false);
      n5(2117, 0, 500, 2, 1, ',', false);
      n5(1093, 0, 500, 2, 1, ',', false);
      n5(1105, 0, 500, 2, 1, ',', false);
      n5(1150, 1252, 20297, 10000, 850, ';', false);
      n5(8218, 1251, 870, 10082, 855, ';', false);
      n5(5146, 1250, 870, 10082, 852, ';', false);
      n5(3, 1252, 500, 10000, 850, ';', false);
      n5(1027, 1252, 500, 10000, 850, ';', false);
      n5(1155, 1252, 20297, 10000, 850, ';', false);
      n5(5, 1250, 500, 10029, 852, ';', false);
      n5(1029, 1250, 500, 10029, 852, ';', false);
      n5(1106, 1252, 20285, 10000, 850, ',', false);
      n5(6, 1252, 20277, 10000, 850, ';', false);
      n5(1030, 1252, 20277, 10000, 850, ';', false);
      n5(7, 1252, 20273, 10000, 850, ';', false);
      n5(3079, 1252, 20273, 10000, 850, ';', false);
      n5(2055, 1252, 20273, 10000, 850, ';', false);
      n5(1031, 1252, 20273, 10000, 850, ';', false);
      n5(5127, 1252, 20273, 10000, 850, ';', false);
      n5(4103, 1252, 20273, 10000, 850, ';', false);
      n5(2094, 1252, 870, 10000, 850, ';', false);
      n5(101, 0, 500, 2, 1, '،', true);
      n5(1125, 0, 500, 2, 1, '،', true);
      n5(8, 1253, 20273, 10006, 737, ';', false);
      n5(1032, 1253, 20273, 10006, 737, ';', false);
      n5(9, 1252, 37, 10000, 437, ',', false);
      n5(9225, 1252, 500, 10000, 850, ',', false);
      n5(3081, 1252, 500, 10000, 850, ',', false);
      n5(10249, 1252, 500, 10000, 850, ';', false);
      n5(4105, 1252, 37, 10000, 850, ',', false);
      n5(2057, 1252, 20285, 10000, 850, ',', false);
      n5(6153, 1252, 500, 10000, 850, ',', false);
      n5(16393, 1252, 37, 10000, 437, ',', false);
      n5(8201, 1252, 500, 10000, 850, ',', false);
      n5(17417, 1252, 37, 10000, 437, ',', false);
      n5(5129, 1252, 500, 10000, 850, ',', false);
      n5(13321, 1252, 500, 10000, 437, ',', false);
      n5(18441, 1252, 37, 10000, 437, ',', false);
      n5(11273, 1252, 500, 10000, 850, ';', false);
      n5(1033, 1252, 37, 10000, 437, ',', false);
      n5(7177, 1252, 500, 10000, 437, ',', false);
      n5(12297, 1252, 500, 10000, 437, ',', false);
      n5(10, 1252, 20284, 10000, 850, ';', false);
      n5(11274, 1252, 20284, 10000, 850, ',', false);
      n5(16394, 1252, 20284, 10000, 850, ',', false);
      n5(13322, 1252, 20284, 10000, 850, ',', false);
      n5(9226, 1252, 20284, 10000, 850, ',', false);
      n5(5130, 1252, 20284, 10000, 850, ',', false);
      n5(7178, 1252, 20284, 10000, 850, ',', false);
      n5(12298, 1252, 20284, 10000, 850, ',', false);
      n5(3082, 1252, 20284, 10000, 850, ';', false);
      n5(4106, 1252, 20284, 10000, 850, ',', false);
      n5(18442, 1252, 20284, 10000, 850, ',', false);
      n5(2058, 1252, 20284, 10000, 850, ',', false);
      n5(19466, 1252, 20284, 10000, 850, ',', false);
      n5(6154, 1252, 20284, 10000, 850, ',', false);
      n5(10250, 1252, 20284, 10000, 850, ',', false);
      n5(20490, 1252, 20284, 10000, 850, ',', false);
      n5(15370, 1252, 20284, 10000, 850, ',', false);
      n5(17418, 1252, 20284, 10000, 850, ',', false);
      n5(21514, 1252, 20284, 10000, 850, ',', false);
      n5(14346, 1252, 20284, 10000, 850, ',', false);
      n5(8202, 1252, 20284, 10000, 850, ',', false);
      n5(37, 1257, 500, 10029, 775, ';', false);
      n5(1061, 1257, 500, 10029, 775, ';', false);
      n5(45, 1252, 500, 10000, 850, ';', false);
      n5(1069, 1252, 500, 10000, 850, ';', false);
      n5(41, 1256, 20420, 10004, 720, ';', true);
      n5(1065, 1256, 20420, 10004, 720, ';', true);
      n5(11, 1252, 20278, 10000, 850, ';', false);
      n5(1035, 1252, 20278, 10000, 850, ';', false);
      n5(1124, 1252, 500, 10000, 437, ',', false);
      n5(56, 1252, 20277, 10079, 850, ';', false);
      n5(1080, 1252, 20277, 10079, 850, ';', false);
      n5(12, 1252, 20297, 10000, 850, ';', false);
      n5(2060, 1252, 20297, 10000, 850, ';', false);
      n5(3084, 1252, 20297, 10000, 850, ';', false);
      n5(4108, 1252, 20297, 10000, 850, ';', false);
      n5(1036, 1252, 20297, 10000, 850, ';', false);
      n5(5132, 1252, 20297, 10000, 850, ';', false);
      n5(6156, 1252, 20297, 10000, 850, ';', false);
      n5(1122, 1252, 500, 10000, 850, ';', false);
      n5(2108, 1252, 500, 10000, 850, ',', false);
      n5(1169, 1252, 20285, 10000, 850, ',', false);
      n5(86, 1252, 500, 10000, 850, ',', false);
      n5(1110, 1252, 500, 10000, 850, ',', false);
      n5(1156, 1252, 20297, 10000, 850, ';', false);
      n5(71, 0, 500, 2, 1, ',', false);
      n5(1095, 0, 500, 2, 1, ',', false);
      n5(1128, 1252, 37, 10000, 437, ',', false);
      n5(13, 1255, 500, 10005, 862, ',', true);
      n5(1037, 1255, 500, 10005, 862, ',', true);
      n5(57, 0, 500, 2, 1, ',', false);
      n5(1081, 0, 500, 2, 1, ',', false);
      n5(26, 1250, 500, 10082, 852, ';', false);
      n5(4122, 1250, 870, 10082, 852, ';', false);
      n5(1050, 1250, 500, 10082, 852, ';', false);
      n5(1070, 1252, 870, 10000, 850, ';', false);
      n5(14, 1250, 500, 10029, 852, ';', false);
      n5(1038, 1250, 500, 10029, 852, ';', false);
      n5(43, 0, 500, 2, 1, ',', false);
      n5(1067, 0, 500, 2, 1, ',', false);
      n5(33, 1252, 500, 10000, 850, ';', false);
      n5(1057, 1252, 500, 10000, 850, ';', false);
      n5(1136, 1252, 37, 10000, 437, ',', false);
      n5(1144, 0, 500, 2, 1, ',', false);
      n5(15, 1252, 20871, 10079, 850, ';', false);
      n5(1039, 1252, 20871, 10079, 850, ';', false);
      n5(16, 1252, 20280, 10000, 850, ';', false);
      n5(2064, 1252, 500, 10000, 850, ';', false);
      n5(1040, 1252, 20280, 10000, 850, ';', false);
      n5(1117, 0, 500, 2, 1, ',', false);
      n5(2141, 1252, 37, 10000, 437, ',', false);
      n5(17, 932, 20290, 10001, 932, ',', false);
      n5(1041, 932, 20290, 10001, 932, ',', false);
      n5(55, 0, 500, 2, 1, ';', false);
      n5(1079, 0, 500, 2, 1, ';', false);
      n5(63, 1251, 20880, 10007, 866, ';', false);
      n5(1087, 1251, 20880, 10007, 866, ';', false);
      n5(1135, 1252, 20277, 10000, 850, ';', false);
      n5(1107, 0, 500, 2, 1, ',', false);
      n5(75, 0, 500, 2, 1, ',', false);
      n5(1099, 0, 500, 2, 1, ',', false);
      n5(18, 949, 20833, 10003, 949, ',', false);
      n5(87, 0, 500, 2, 1, ',', false);
      n5(1111, 0, 500, 2, 1, ',', false);
      n5(1042, 949, 20833, 10003, 949, ',', false);
      n5(64, 1251, 20880, 10007, 866, ';', false);
      n5(1088, 1251, 20880, 10007, 866, ';', false);
      n5(1134, 1252, 20297, 10000, 850, ';', false);
      n5(1108, 0, 500, 2, 1, ',', false);
      n5(39, 1257, 500, 10029, 775, ';', false);
      n5(1063, 1257, 500, 10029, 775, ';', false);
      n5(38, 1257, 500, 10029, 775, ';', false);
      n5(1062, 1257, 500, 10029, 775, ';', false);
      n5(1153, 0, 500, 2, 1, ',', false);
      n5(47, 1251, 500, 10007, 866, ';', false);
      n5(1071, 1251, 500, 10007, 866, ';', false);
      n5(1100, 0, 500, 2, 1, ',', false);
      n5(80, 1251, 20880, 10007, 866, ';', false);
      n5(1104, 1251, 20880, 10007, 866, ';', false);
      n5(2128, 0, 500, 2, 1, ',', false);
      n5(1148, 1252, 37, 10000, 850, ',', false);
      n5(78, 0, 500, 2, 1, ',', false);
      n5(1102, 0, 500, 2, 1, ',', false);
      n5(62, 1252, 500, 10000, 850, ';', false);
      n5(2110, 1252, 500, 10000, 850, ';', false);
      n5(1086, 1252, 500, 10000, 850, ';', false);
      n5(1082, 0, 500, 2, 1, ',', false);
      n5(1044, 1252, 20277, 10000, 850, ';', false);
      n5(1121, 0, 500, 2, 1, ',', false);
      n5(19, 1252, 500, 10000, 850, ';', false);
      n5(2067, 1252, 500, 10000, 850, ';', false);
      n5(1043, 1252, 500, 10000, 850, ';', false);
      n5(2068, 1252, 20277, 10000, 850, ';', false);
      n5(20, 1252, 20277, 10000, 850, ';', false);
      n5(1132, 1252, 500, 10000, 850, ',', false);
      n5(1154, 1252, 20297, 10000, 850, ';', false);
      n5(1096, 0, 500, 2, 1, ',', false);
      n5(70, 0, 500, 2, 1, ',', false);
      n5(1094, 0, 500, 2, 1, ',', false);
      n5(21, 1250, 20880, 10029, 852, ';', false);
      n5(1045, 1250, 20880, 10029, 852, ';', false);
      n5(1164, 1256, 20420, 10004, 720, ';', false);
      n5(1123, 0, 500, 2, 1, ';', false);
      n5(22, 1252, 500, 10000, 850, ';', false);
      n5(1046, 1252, 500, 10000, 850, ';', false);
      n5(2070, 1252, 500, 10000, 850, ';', false);
      n5(1158, 1252, 20284, 10000, 850, ',', false);
      n5(1131, 1252, 20284, 10000, 850, ',', false);
      n5(2155, 1252, 20284, 10000, 850, ',', false);
      n5(3179, 1252, 20284, 10000, 850, ',', false);
      n5(1047, 1252, 20273, 10000, 850, ';', false);
      n5(24, 1250, 20880, 10029, 852, ';', false);
      n5(1048, 1250, 20880, 10029, 852, ';', false);
      n5(25, 1251, 20880, 10007, 866, ';', false);
      n5(1049, 1251, 20880, 10007, 866, ';', false);
      n5(1159, 1252, 37, 10000, 437, ';', false);
      n5(79, 0, 500, 2, 1, ',', false);
      n5(1157, 1251, 20880, 10007, 866, ';', false);
      n5(1103, 0, 500, 2, 1, ',', false);
      n5(3131, 1252, 20278, 10000, 850, ';', false);
      n5(1083, 1252, 20277, 10000, 850, ';', false);
      n5(2107, 1252, 20278, 10000, 850, ';', false);
      n5(1115, 0, 500, 2, 1, ',', false);
      n5(27, 1250, 20880, 10029, 852, ';', false);
      n5(1051, 1250, 20880, 10029, 852, ';', false);
      n5(36, 1250, 20880, 10029, 852, ';', false);
      n5(1060, 1250, 20880, 10029, 852, ';', false);
      n5(6203, 1252, 20277, 10000, 850, ';', false);
      n5(7227, 1252, 20278, 10000, 850, ';', false);
      n5(4155, 1252, 20277, 10000, 850, ';', false);
      n5(5179, 1252, 20278, 10000, 850, ';', false);
      n5(9275, 1252, 20278, 10000, 850, ';', false);
      n5(8251, 1252, 20278, 10000, 850, ';', false);
      n5(28, 1250, 20880, 10029, 852, ';', false);
      n5(1052, 1250, 20880, 10029, 852, ';', false);
      n5(31770, 1251, 21025, 10007, 855, ';', false);
      n5(7194, 1251, 21025, 10007, 855, ';', false);
      n5(3098, 1251, 21025, 10007, 855, ';', false);
      n5(12314, 1251, 21025, 10007, 855, ';', false);
      n5(10266, 1251, 21025, 10007, 855, ';', false);
      n5(6170, 1250, 870, 10082, 852, ';', false);
      n5(2074, 1250, 500, 10029, 852, ';', false);
      n5(11290, 1250, 500, 10029, 852, ';', false);
      n5(9242, 1250, 500, 10029, 852, ';', false);
      n5(29, 1252, 20278, 10000, 850, ';', false);
      n5(2077, 1252, 20278, 10000, 850, ';', false);
      n5(1053, 1252, 20278, 10000, 850, ';', false);
      n5(65, 1252, 500, 10000, 437, ',', false);
      n5(1089, 1252, 500, 10000, 437, ',', false);
      n5(90, 0, 500, 2, 1, ',', true);
      n5(1114, 0, 500, 2, 1, ',', true);
      n5(73, 0, 500, 2, 1, ',', false);
      n5(1097, 0, 500, 2, 1, ',', false);
      n5(74, 0, 500, 2, 1, ',', false);
      n5(1098, 0, 500, 2, 1, ',', false);
      n5(1064, 1251, 20880, 10007, 866, ';', false);
      n5(30, 874, 20838, 10021, 874, ',', false);
      n5(1054, 874, 20838, 10021, 874, ',', false);
      n5(1090, 1250, 20880, 10029, 852, ';', false);
      n5(1074, 1252, 500, 10000, 850, ',', false);
      n5(31, 1254, 20905, 10081, 857, ';', false);
      n5(1055, 1254, 20905, 10081, 857, ';', false);
      n5(68, 1251, 20880, 10007, 866, ';', false);
      n5(1092, 1251, 20880, 10007, 866, ';', false);
      n5(2143, 1252, 20297, 10000, 850, ';', false);
      n5(1152, 1256, 20420, 10004, 720, ',', false);
      n5(34, 1251, 500, 10017, 866, ';', false);
      n5(1058, 1251, 500, 10017, 866, ';', false);
      n5(32, 1256, 20420, 10004, 720, ';', true);
      n5(1056, 1256, 20420, 10004, 720, ';', true);
      n5(67, 1254, 500, 10029, 857, ';', false);
      n5(2115, 1251, 20880, 10007, 866, ';', false);
      n5(1091, 1254, 500, 10029, 857, ';', false);
      n5(42, 1258, 500, 10000, 1258, ',', false);
      n5(1066, 1258, 500, 10000, 1258, ',', false);
      n5(1160, 1252, 20297, 10000, 850, ';', false);
      n5(1076, 1252, 500, 10000, 850, ',', false);
      n5(1130, 1252, 37, 10000, 437, ',', false);
      n5(4, 936, 500, 10008, 936, ',', false);
      n5(31748, 950, 500, 10002, 950, ',', false);
      n5(2052, 936, 500, 10008, 936, ',', false);
      n5(3076, 950, 500, 10002, 950, ',', false);
      n5(5124, 950, 500, 10002, 950, ',', false);
      n5(4100, 936, 500, 10008, 936, ',', false);
      n5(1028, 950, 500, 10002, 950, ',', false);
      n5(1077, 1252, 500, 10000, 850, ',', false);
      l6 var0 = new l6(127, false);
      var0.s7 = true;
      t4 = var0;
   }
}
