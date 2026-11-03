package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.Dictionary$Enumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

class k2h {
   static void n5(Presentation var0, int[] var1, XamlOptions var2, InterruptionToken var3) {
      if (com.aspose.slides.ms.System.d1.n5(var2.h0())) {
         var2.n5("Slide");
      }

      if (var2.l6().l6() == 0.0F || var2.l6().k5() == 0.0F) {
         var2.n5(new com.aspose.slides.internal.o9b.f2(((SlideSize)var0.getSlideSize()).n5().l6(), ((SlideSize)var0.getSlideSize()).n5().k5()));
      }

      k4y var4 = null;
      if (var2 != null && var2.getProgressCallback() != null) {
         var4 = new k4y(var2.getProgressCallback());
         var4.n5(var0, var1);
      }

      Dictionary var5 = new Dictionary();
      switch (var2.u3()) {
         case 0:
            String var11 = com.aspose.slides.internal.z0k.z1.l6(var2.a6(), var2.u9());
            var2.l6(var11);
            var5 = n5(var0, var2, var3);
            break;
         case 1:
            String var6 = n5(var0);
            var2.l6(var6);
            var5 = l6(var0, var2, var3);
      }

      Dictionary$Enumerator var12 = var5.iterator();

      try {
         while (var12.hasNext()) {
            KeyValuePair var7 = (KeyValuePair)var12.next();
            var2.getOutputSaver().save((String)var7.getKey(), (byte[])var7.getValue());
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var12, IDisposable.class)) {
            var12.dispose();
         }
      }

      if (var4 != null) {
         var4.n5();
      }
   }

   private static Dictionary<String, byte[]> n5(Presentation var0, XamlOptions var1, InterruptionToken var2) {
      Dictionary var3 = new Dictionary();
      c5j var4 = l6c.l6(var1);
      Dictionary var5 = var4.n5(var1);
      p5g.n5(var5, var3);
      t5e var6 = l6c.k5(var1);
      Dictionary var7 = var6.n5(var0, var1, var2);
      p5g.n5(var7, var3);
      List var8 = new List();
      l2w var9 = l6c.n5(var1);
      List[] var10 = new List[]{var8};
      Dictionary var11 = var9.n5(var0, var1, var10, var2);
      var8 = var10[0];
      p5g.n5(var11, var3);
      if (var8 != null && var8.size() > 0) {
         g4d var12 = new g4d();
         String var13 = com.aspose.slides.ms.System.d1.n5(new String[]{var1.u9(), ".csproj"});
         String var14 = com.aspose.slides.ms.System.d1.n5;
         byte[] var15 = null;
         String var16 = com.aspose.slides.ms.System.d1.n5;
         byte[] var17 = null;
         List var18 = new List();
         String var19 = var9.n5(var8);
         Dictionary$Enumerator var20 = var3.iterator();

         try {
            while (var20.hasNext()) {
               KeyValuePair var21 = (KeyValuePair)var20.next();
               if (com.aspose.slides.ms.System.d1.t2((String)var21.getKey(), var13)) {
                  var14 = (String)var21.getKey();
                  var15 = (byte[])var21.getValue();
               }

               if (com.aspose.slides.ms.System.d1.t2((String)var21.getKey(), "MainWindow.xaml.cs")) {
                  var16 = (String)var21.getKey();
                  var17 = (byte[])var21.getValue();
               }

               if (!com.aspose.slides.ms.System.d1.l6((String)var21.getKey(), com.aspose.slides.ms.System.d1.n5(new String[]{var1.a6(), "\\"}))) {
                  var18.addItem(var21.getKey());
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var20, IDisposable.class)) {
               var20.dispose();
            }
         }

         List$Enumerator var51 = var18.iterator();

         try {
            while (var51.hasNext()) {
               String var22 = (String)var51.next();
               byte[] var23 = (byte[])var3.get_Item(var22);
               String var24 = com.aspose.slides.internal.z0k.z1.l6(var1.z1(), var22);
               var3.removeItemByKey(var22);
               var3.addItem(var24, var23);
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var51, IDisposable.class)) {
               var51.dispose();
            }
         }

         if (!com.aspose.slides.ms.System.d1.n5(var14) && var15 != null) {
            String var52 = v7.n5(var15);
            List$Enumerator var54 = var8.iterator();

            try {
               while (var54.hasNext()) {
                  String var58 = (String)var54.next();
                  var52 = var12.n5(var52, var58);
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var54, IDisposable.class)) {
                  var54.dispose();
               }
            }

            List$Enumerator var59 = var18.iterator();

            try {
               while (var59.hasNext()) {
                  String var25 = (String)var59.next();
                  var52 = var12.k5(var52, var25);
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var59, IDisposable.class)) {
                  var59.dispose();
               }
            }

            var15 = v7.n5(var52);
            var3.removeItemByKey(var14);
            var3.addItem(var14, var15);
         }

         if (!com.aspose.slides.ms.System.d1.n5(var16) && var17 != null && var1.c8()) {
            int var53 = y4o.n5(var0.getSlides(), var1);
            String var55 = v7.n5(var17);
            var55 = com.aspose.slides.ms.System.d1.n5(var55, "{Cases}", var19);
            var55 = com.aspose.slides.ms.System.d1.n5(var55, "{SlidesCount}", com.aspose.slides.ms.System.a3.l6(var53));
            var17 = v7.n5(var55);
            var3.removeItemByKey(var16);
            var3.addItem(var16, var17);
         }
      }

      return var3;
   }

   private static Dictionary<String, byte[]> l6(Presentation var0, XamlOptions var1, InterruptionToken var2) {
      t5e var3 = l6c.k5(var1);
      Dictionary var4 = var3.n5(var0, var1, var2);
      List var5 = new List();
      Dictionary$Enumerator var6 = var4.iterator();

      try {
         while (var6.hasNext()) {
            KeyValuePair var7 = (KeyValuePair)var6.next();
            if (!com.aspose.slides.ms.System.d1.l6((String)var7.getKey(), com.aspose.slides.ms.System.d1.n5(new String[]{var1.z1(), "\\"}))) {
               var5.addItem(var7.getKey());
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var6, IDisposable.class)) {
            var6.dispose();
         }
      }

      List$Enumerator var18 = var5.iterator();

      try {
         while (var18.hasNext()) {
            String var8 = (String)var18.next();
            byte[] var9 = (byte[])var4.get_Item(var8);
            String var10 = com.aspose.slides.internal.z0k.z1.l6(var1.z1(), var8);
            var4.removeItemByKey(var8);
            var4.addItem(var10, var9);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var18, IDisposable.class)) {
            var18.dispose();
         }
      }

      return var4;
   }

   static void l6(Presentation var0, int[] var1, XamlOptions var2, InterruptionToken var3) {
      if (com.aspose.slides.ms.System.d1.n5(var2.h0())) {
         var2.n5("Slide");
      }

      if (var2.l6().l6() == 0.0F || var2.l6().k5() == 0.0F) {
         var2.n5(new com.aspose.slides.internal.o9b.f2(((SlideSize)var0.getSlideSize()).n5().l6(), ((SlideSize)var0.getSlideSize()).n5().k5()));
      }

      k4y var4 = null;
      if (var2 != null && var2.getProgressCallback() != null) {
         var4 = new k4y(var2.getProgressCallback());
         var4.n5(var0, var1);
      }

      Dictionary var5 = new Dictionary();
      switch (var2.u3()) {
         case 0:
            String var11 = com.aspose.slides.internal.z0k.z1.l6(var2.a6(), var2.u9());
            var2.l6(var11);
            var5 = k5(var0, var2, var3);
            break;
         case 1:
            String var6 = n5(var0);
            var2.l6(var6);
            var5 = u3(var0, var2, var3);
      }

      Dictionary$Enumerator var12 = var5.iterator();

      try {
         while (var12.hasNext()) {
            KeyValuePair var7 = (KeyValuePair)var12.next();
            var2.getOutputSaver().save((String)var7.getKey(), (byte[])var7.getValue());
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var12, IDisposable.class)) {
            var12.dispose();
         }
      }

      if (var4 != null) {
         var4.n5();
      }
   }

   private static Dictionary<String, byte[]> k5(Presentation var0, XamlOptions var1, InterruptionToken var2) {
      Dictionary var3 = new Dictionary();
      c5j var4 = l6c.l6(var1);
      Dictionary var5 = var4.n5(var1);
      p5g.n5(var5, var3);
      t5e var6 = l6c.k5(var1);
      Dictionary var7 = var6.n5(var0, var1, var2);
      p5g.n5(var7, var3);
      List var8 = new List();
      l2w var9 = l6c.n5(var1);
      List[] var10 = new List[]{var8};
      Dictionary var11 = var9.n5(var0, var1, var10, var2);
      var8 = var10[0];
      p5g.n5(var11, var3);
      if (var8 != null && var8.size() > 0) {
         g4d var12 = new g4d();
         String var13 = com.aspose.slides.ms.System.d1.n5(new String[]{com.aspose.slides.ms.System.d1.n5(new String[]{var1.u9(), ".Android"}), ".csproj"});
         String var14 = com.aspose.slides.ms.System.d1.n5;
         byte[] var15 = null;
         String var16 = com.aspose.slides.ms.System.d1.n5;
         byte[] var17 = null;
         List var18 = new List();
         String var19 = var9.n5(var8);
         Dictionary$Enumerator var20 = var3.iterator();

         try {
            while (var20.hasNext()) {
               KeyValuePair var21 = (KeyValuePair)var20.next();
               if (com.aspose.slides.ms.System.d1.t2((String)var21.getKey(), var13)) {
                  var14 = (String)var21.getKey();
                  var15 = (byte[])var21.getValue();
               }

               if (com.aspose.slides.ms.System.d1.t2((String)var21.getKey(), "MainPage.xaml.cs")) {
                  var16 = (String)var21.getKey();
                  var17 = (byte[])var21.getValue();
               }

               if (!com.aspose.slides.ms.System.d1.l6((String)var21.getKey(), com.aspose.slides.ms.System.d1.n5(new String[]{var1.a6(), "\\"}))) {
                  var18.addItem(var21.getKey());
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var20, IDisposable.class)) {
               var20.dispose();
            }
         }

         List$Enumerator var42 = var18.iterator();

         try {
            while (var42.hasNext()) {
               String var22 = (String)var42.next();
               byte[] var23 = (byte[])var3.get_Item(var22);
               String var24 = com.aspose.slides.internal.z0k.z1.l6(var1.a6(), var1.u9());
               var24 = com.aspose.slides.internal.z0k.z1.l6(var24, com.aspose.slides.ms.System.d1.n5(new String[]{var1.u9(), ".Android"}));
               var24 = com.aspose.slides.internal.z0k.z1.l6(var24, "Resources\\drawable");
               var24 = com.aspose.slides.internal.z0k.z1.l6(var24, var22);
               var3.removeItemByKey(var22);
               var3.addItem(var24, var23);
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var42, IDisposable.class)) {
               var42.dispose();
            }
         }

         if (!com.aspose.slides.ms.System.d1.n5(var14) && var15 != null) {
            String var43 = v7.n5(var15);
            List$Enumerator var45 = var18.iterator();

            try {
               while (var45.hasNext()) {
                  String var52 = (String)var45.next();
                  String var25 = com.aspose.slides.internal.z0k.z1.l6("Resources\\drawable", var52);
                  var43 = var12.l6(var43, var25);
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var45, IDisposable.class)) {
                  var45.dispose();
               }
            }

            var15 = v7.n5(var43);
            var3.removeItemByKey(var14);
            var3.addItem(var14, var15);
         }

         if (!com.aspose.slides.ms.System.d1.n5(var16) && var17 != null && var1.c8()) {
            int var44 = y4o.n5(var0.getSlides(), var1);
            String var46 = v7.n5(var17);
            var46 = com.aspose.slides.ms.System.d1.n5(var46, "{Cases}", var19);
            var46 = com.aspose.slides.ms.System.d1.n5(var46, "{SlidesCount}", com.aspose.slides.ms.System.a3.l6(var44));
            var17 = v7.n5(var46);
            var3.removeItemByKey(var16);
            var3.addItem(var16, var17);
         }
      }

      return var3;
   }

   private static Dictionary<String, byte[]> u3(Presentation var0, XamlOptions var1, InterruptionToken var2) {
      t5e var3 = l6c.k5(var1);
      Dictionary var4 = var3.n5(var0, var1, var2);
      List var5 = new List();
      Dictionary$Enumerator var6 = var4.iterator();

      try {
         while (var6.hasNext()) {
            KeyValuePair var7 = (KeyValuePair)var6.next();
            if (!com.aspose.slides.ms.System.d1.l6((String)var7.getKey(), com.aspose.slides.ms.System.d1.n5(new String[]{var1.z1(), "\\"}))) {
               var5.addItem(var7.getKey());
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var6, IDisposable.class)) {
            var6.dispose();
         }
      }

      List$Enumerator var18 = var5.iterator();

      try {
         while (var18.hasNext()) {
            String var8 = (String)var18.next();
            byte[] var9 = (byte[])var4.get_Item(var8);
            String var10 = com.aspose.slides.internal.z0k.z1.l6(var1.z1(), var8);
            var4.removeItemByKey(var8);
            var4.addItem(var10, var9);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var18, IDisposable.class)) {
            var18.dispose();
         }
      }

      return var4;
   }

   private static String n5(Presentation var0) {
      return com.aspose.slides.ms.System.d1.n5(var0.l6) ? "" : com.aspose.slides.internal.z0k.z1.l6(var0.l6);
   }
}
