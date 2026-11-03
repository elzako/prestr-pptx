package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;

class c3 {
   private static final String[] n5 = new String[45];
   private static final String[] l6 = new String[45];
   private static final Dictionary<String, c3$n5> k5 = new Dictionary<>();
   private static final String[] u3 = new String[]{"msArrowEnd_", "msArrowOpenEnd_", "msArrowStealthEnd_", "msArrowDiamondEnd_", "msArrowOvalEnd_"};

   private static int k5(byte var0, byte var1, byte var2) {
      if (var2 < 0) {
         var2 = 1;
      }

      if (var1 < 0) {
         var1 = 1;
      }

      return (var0 - 1) * 9 + var1 * 3 + var2;
   }

   private static void n5(byte var0, byte var1, byte var2, String var3, String var4) {
      int var5 = k5(var0, var1, var2);
      if (n5[var5] == null) {
         n5[var5] = var4;
         l6[var5] = var3;
      }

      k5.addItem(var4, new c3$n5(var0, var1, var2));
   }

   public static String n5(byte var0, byte var1, byte var2) {
      return n5[k5(var0, var1, var2)];
   }

   public static String n5(byte var0) {
      int var1 = var0 - 1;
      return var1 >= 0 && var1 < u3.length ? u3[var1] : "Marker_";
   }

   public static String l6(byte var0, byte var1, byte var2) {
      return l6[k5(var0, var1, var2)];
   }

   public static void n5(String var0, String var1, double var2, double var4, byte[] var6, byte[] var7, byte[] var8) {
      var6[0] = -1;
      c3$n5 var9 = null;
      c3$n5[] var10 = new c3$n5[]{var9};
      boolean var11 = k5.tryGetValue(com.aspose.slides.ms.System.d1.u9(var0), var10);
      var9 = var10[0];
      if (var11) {
         var6[0] = var9.n5;
         var7[0] = var9.l6;
         var8[0] = var9.k5;
         double var12 = (1 + (1 << com.aspose.slides.ms.System.q1.n5((int)(0), (int)(var8[0])))) * var2 * 1.2;
         if (var4 > var12 * 0.97 && var4 < var12 * 1.03) {
            return;
         }
      }

      if (var6[0] == -1) {
         var6[0] = 1;
      }

      var8[0] = n5(var2, var4);
      var7[0] = var8[0];
      com.aspose.slides.internal.o9b.y1 var14 = com.aspose.slides.internal.n8e.i6.n5(var1).y4();
      if (var14.s7() > var14.k5() * 1.8) {
         var7[0] = (byte)(var8[0] - 2);
      } else if (var14.s7() > var14.k5() * 1.2) {
         var7[0] = (byte)(var8[0] - 1);
      } else if (var14.k5() > var14.s7() * 1.8) {
         var7[0] = (byte)(var8[0] + 2);
      } else if (var14.k5() > var14.s7() * 1.2) {
         var7[0] = (byte)(var8[0] + 1);
      }

      if (var7[0] < 0) {
         var7[0] = 0;
      }

      if (var7[0] > 2) {
         var7[0] = 2;
      }
   }

   public static byte n5(double var0, double var2) {
      double var4 = var2 / var0;
      if (var4 < 2.5) {
         return 0;
      } else {
         return (byte)(var4 > 4.5 ? 2 : 1);
      }
   }

   static {
      n5((byte)1, (byte)0, (byte)0, "0 0 352 352", "m176 0 176 352h-352z");
      n5((byte)1, (byte)1, (byte)0, "0 0 352 528", "m176 0 176 528h-352z");
      n5((byte)1, (byte)2, (byte)0, "0 0 352 880", "m176 0 176 880h-352z");
      n5((byte)1, (byte)0, (byte)1, "0 0 528 352", "m264 0 264 352h-528z");
      n5((byte)1, (byte)1, (byte)1, "0 0 528 528", "m264 0 264 528h-528z");
      n5((byte)1, (byte)2, (byte)1, "0 0 528 880", "m264 0 264 880h-528z");
      n5((byte)1, (byte)0, (byte)2, "0 0 880 352", "m440 0 440 352h-880z");
      n5((byte)1, (byte)1, (byte)2, "0 0 880 528", "m440 0 440 528h-880z");
      n5((byte)1, (byte)2, (byte)2, "0 0 880 880", "m440 0 440 880h-880z");
      n5((byte)5, (byte)0, (byte)0, "0 0 616 616", "m308 0 308 561-92 55-216-394-216 394-92-55z");
      n5((byte)5, (byte)1, (byte)0, "0 0 616 792", "m308 0 308 721-92 71-216-507-216 507-92-71z");
      n5((byte)5, (byte)2, (byte)0, "0 0 616 1056", "m308 0 308 961-92 95-216-676-216 676-92-95z");
      n5((byte)5, (byte)0, (byte)1, "0 0 792 616", "m396 0 396 561-119 55-277-394-277 394-119-55z");
      n5((byte)5, (byte)1, (byte)1, "0 0 792 792", "m396 0 396 721-119 71-277-507-277 507-119-71z");
      n5((byte)5, (byte)2, (byte)1, "0 0 792 1056", "m396 0 396 961-119 95-277-676-277 676-119-95z");
      n5((byte)5, (byte)0, (byte)2, "0 0 1056 616", "m528 0 528 561-158 55-370-394-370 394-158-55z");
      n5((byte)5, (byte)1, (byte)2, "0 0 1056 792", "m528 0 528 721-158 71-370-507-370 507-158-71z");
      n5((byte)5, (byte)2, (byte)2, "0 0 1056 1056", "m528 0 528 961-158 95-370-676-370 676-158-95z");
      n5((byte)2, (byte)0, (byte)0, "0 0 352 352", "m176 0 176 352-176-141-176 141z");
      n5((byte)2, (byte)1, (byte)0, "0 0 352 528", "m176 0 176 528-176-211-176 211z");
      n5((byte)2, (byte)2, (byte)0, "0 0 352 880", "m176 0 176 880-176-352-176 352z");
      n5((byte)2, (byte)0, (byte)1, "0 0 528 352", "m264 0 264 352-264-141-264 141z");
      n5((byte)2, (byte)1, (byte)1, "0 0 528 528", "m264 0 264 528-264-211-264 211z");
      n5((byte)2, (byte)2, (byte)1, "0 0 528 880", "m264 0 264 880-264-352-264 352z");
      n5((byte)2, (byte)0, (byte)2, "0 0 880 352", "m440 0 440 352-440-141-440 141z");
      n5((byte)2, (byte)1, (byte)2, "0 0 880 528", "m440 0 440 528-440-211-440 211z");
      n5((byte)2, (byte)2, (byte)2, "0 0 880 880", "m440 0 440 880-440-352-440 352z");
      n5((byte)3, (byte)0, (byte)0, "0 0 352 352", "m176 0 176 176-176 176-176-176z");
      n5((byte)3, (byte)1, (byte)0, "0 0 352 528", "m176 0 176 264-176 264-176-264z");
      n5((byte)3, (byte)2, (byte)0, "0 0 352 880", "m176 0 176 440-176 440-176-440z");
      n5((byte)3, (byte)0, (byte)1, "0 0 528 352", "m264 0 264 176-264 176-264-176z");
      n5((byte)3, (byte)1, (byte)1, "0 0 528 528", "m264 0 264 264-264 264-264-264z");
      n5((byte)3, (byte)2, (byte)1, "0 0 528 880", "m264 0 264 440-264 440-264-440z");
      n5((byte)3, (byte)0, (byte)2, "0 0 880 352", "m440 0 440 176-440 176-440-176z");
      n5((byte)3, (byte)1, (byte)2, "0 0 880 528", "m440 0 440 264-440 264-440-264z");
      n5((byte)3, (byte)2, (byte)2, "0 0 880 880", "m440 0 440 440-440 440-440-440z");
      n5((byte)4, (byte)0, (byte)0, "0 0 352 352", "m352 0c0-97-79-176-176-176s-176 79-176 176 79 176 176 176 176-79 176-176z");
      n5((byte)4, (byte)1, (byte)0, "0 0 352 528", "m352 0c0-145-79-264-176-264s-176 119-176 264 79 264 176 264 176-119 176-264z");
      n5((byte)4, (byte)2, (byte)0, "0 0 352 880", "m352 0c0-243-79-440-176-440s-176 197-176 440 79 440 176 440 176-197 176-440z");
      n5((byte)4, (byte)0, (byte)1, "0 0 528 352", "m528 0c0-97-119-176-264-176s-264 79-264 176 119 176 264 176 264-79 264-176z");
      n5((byte)4, (byte)1, (byte)1, "0 0 528 528", "m528 0c0-145-119-264-264-264s-264 119-264 264 119 264 264 264 264-119 264-264z");
      n5((byte)4, (byte)2, (byte)1, "0 0 528 880", "m528 0c0-243-119-440-264-440s-264 197-264 440 119 440 264 440 264-197 264-440z");
      n5((byte)4, (byte)0, (byte)2, "0 0 880 352", "m880 0c0-97-197-176-440-176s-440 79-440 176 197 176 440 176 440-79 440-176z");
      n5((byte)4, (byte)1, (byte)2, "0 0 880 528", "m880 0c0-145-197-264-440-264s-440 119-440 264 197 264 440 264 440-119 440-264z");
      n5((byte)4, (byte)2, (byte)2, "0 0 880 880", "m880 0c0-243-197-440-440-440s-440 197-440 440 197 440 440 440 440-197 440-440z");
      n5((byte)1, (byte)-1, (byte)-1, null, "m10 0-10 30h20z");
      n5((byte)1, (byte)-1, (byte)-1, null, "m1321 3493h-1321l702-3493z");
      n5((byte)1, (byte)-1, (byte)-1, null, "m737 1131h394l-564-1131-567 1131h398l-398 787h1131z");
      n5((byte)1, (byte)-1, (byte)-1, null, "m1009 1050-449-1008-22-30-29-12-34 12-21 26-449 1012-5 13v8l5 21 12 21 17 13 21 4h903l21-4 21-13 9-21 4-21v-8z");
      n5((byte)1, (byte)-1, (byte)-1, null, "m564 0-564 902h1131z");
      n5(
         (byte)1,
         (byte)-1,
         (byte)-1,
         null,
         "m1127 2120-449-2006-9-42-25-39-38-25-38-8-43 8-38 25-25 39-9 42-449 2006v13l-4 9 9 42 25 38 38 25 42 9h903l42-9 38-25 26-38 8-42v-9z"
      );
      n5((byte)3, (byte)-1, (byte)-1, null, "m0 0h10v10h-10z");
      n5((byte)3, (byte)-1, (byte)-1, null, "m0 564 564 567 567-567-567-564z");
      n5(
         (byte)5,
         (byte)-1,
         (byte)-1,
         null,
         "m0 2108v17 17l12 42 30 34 38 21 43 4 29-8 30-21 25-26 13-34 343-1532 339 1520 13 42 29 34 39 21 42 4 42-12 34-30 21-42v-39-12l-4 4-440-1998-9-42-25-39-38-25-43-8-42 8-38 25-26 39-8 42z"
      );
      n5(
         (byte)4,
         (byte)-1,
         (byte)-1,
         null,
         "m462 1118-102-29-102-51-93-72-72-93-51-102-29-102-13-105 13-102 29-106 51-102 72-89 93-72 102-50 102-34 106-9 101 9 106 34 98 50 93 72 72 89 51 102 29 106 13 102-13 105-29 102-51 102-72 93-93 72-98 51-106 29-101 13z"
      );
      n5((byte)2, (byte)-1, (byte)-1, null, "m1013 1491 118 89-567-1580-564 1580 114-85 136-68 148-46 161-17 161 13 153 46z");
   }
}
