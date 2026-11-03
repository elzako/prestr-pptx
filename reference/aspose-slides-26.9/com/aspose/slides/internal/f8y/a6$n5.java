package com.aspose.slides.internal.f8y;

import java.util.HashMap;

enum a6$n5 {
   NoneYet(0),
   SyncOutput(1),
   SyncError(2),
   AsyncOutput(4),
   AsyncError(8);

      // Preserve original obfuscated fields while restoring Enum.name()/valueOf().
      public static final a6$n5 n5 = NoneYet;
      public static final a6$n5 l6 = SyncOutput;
      public static final a6$n5 k5 = SyncError;
      public static final a6$n5 u3 = AsyncOutput;
      public static final a6$n5 a6 = AsyncError;
      private static final a6$n5[] c8 = {NoneYet, SyncOutput, SyncError, AsyncOutput, AsyncError};


   private int u9;
   private static HashMap<Integer, a6$n5> h0;

   private static synchronized HashMap<Integer, a6$n5> l6() {
      if (h0 == null) {
         h0 = new HashMap<>();
      }

      return h0;
   }

   a6$n5(int var3) {
      this.u9 = var3;
      l6().put(var3, this);
   }

   public int n5() {
      return this.u9;
   }

   public static a6$n5 n5(int var0) {
      return l6().get(var0);
   }

   // $VF: synthetic method
   static int n5(a6$n5 var0) {
      return var0.u9;
   }

   // $VF: synthetic method
   static int n5(a6$n5 var0, int var1) {
      return var0.u9 = var1;
   }
}
