package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.ms.System.IDisposable;

class f9h implements a2c {
   private final String n5;
   private final String l6;

   public f9h(String var1, String var2) {
      this.n5 = var1;
      this.l6 = var2;
   }

   @Override
   public final List<String> n5(IShape var1, XamlOptions var2, Dictionary<String, byte[]>[] var3) {
      Dictionary var4 = new Dictionary();
      List var5 = new List();
      if (com.aspose.slides.internal.v6g.k5.l6(var1, IAutoShape.class)) {
         IAutoShape var6 = com.aspose.slides.internal.v6g.k5.n5(var1, IAutoShape.class);
         var5 = this.n5(var6, var2);
      }

      if (com.aspose.slides.internal.v6g.k5.l6(var1, IGroupShape.class)) {
         IGroupShape var12 = com.aspose.slides.internal.v6g.k5.n5(var1, IGroupShape.class);
         Dictionary var7 = new Dictionary();
         Dictionary[] var8 = new Dictionary[]{var7};
         var5 = this.n5(var12, var2, var8);
         var7 = var8[0];
         p5g.n5(var7, var4);
      }

      if (com.aspose.slides.internal.v6g.k5.l6(var1, IPictureFrame.class)) {
         IPictureFrame var13 = com.aspose.slides.internal.v6g.k5.n5(var1, IPictureFrame.class);
         KeyValuePair var18 = new KeyValuePair();
         KeyValuePair[] var23 = new KeyValuePair[]{var18};
         String var9 = this.n5(var13, var2, var23);
         var18 = var23[0];
         if (!com.aspose.slides.ms.System.d1.n5((String)var18.getKey())) {
            var4.addItem(var18.getKey(), var18.getValue());
         }

         var5.addItem(var9);
      }

      if (com.aspose.slides.internal.v6g.k5.l6(var1, IConnector.class)) {
         IConnector var14 = com.aspose.slides.internal.v6g.k5.n5(var1, IConnector.class);
         var5 = this.n5(var14, var2);
      }

      if (com.aspose.slides.internal.v6g.k5.l6(var1, IChart.class)) {
         IChart var15 = com.aspose.slides.internal.v6g.k5.n5(var1, IChart.class);
         KeyValuePair var20 = new KeyValuePair();
         KeyValuePair[] var24 = new KeyValuePair[]{var20};
         String var26 = this.n5(var15, var2, var24);
         var20 = var24[0];
         if (!com.aspose.slides.ms.System.d1.n5((String)var20.getKey())) {
            var4.addItem(var20.getKey(), var20.getValue());
         }

         var5.addItem(var26);
      }

      if (com.aspose.slides.internal.v6g.k5.l6(var1, ITable.class)) {
         r8k var16 = a6b.n5(var1, var2, this.n5);
         String var22 = var16.toString();
         var5.addItem(var22);
         ITable var25 = com.aspose.slides.internal.v6g.k5.n5(var1, ITable.class);
         KeyValuePair var27 = new KeyValuePair();
         KeyValuePair[] var10 = new KeyValuePair[]{var27};
         String var11 = this.n5(var25, var2, var10);
         var27 = var10[0];
         if (!com.aspose.slides.ms.System.d1.n5((String)var27.getKey())) {
            var4.addItem(var27.getKey(), var27.getValue());
         }

         var5.addItem(var11);
         var5.addItem(this.l6);
      }

      var3[0] = var4;
      return var5;
   }

   private String n5(ITable var1, XamlOptions var2, KeyValuePair<String, byte[]>[] var3) {
      e5n var4 = a6b.l6(var2);
      String var5 = var4.n5(var1, var2);
      String var6 = com.aspose.slides.internal.z0k.z1.l6(var2.z1(), var4.l6());
      KeyValuePair var7 = new KeyValuePair<>(var6, var4.n5());
      var7.CloneTo(var3[0]);
      return var5;
   }

   private List<String> n5(IGroupShape var1, XamlOptions var2, Dictionary<String, byte[]>[] var3) {
      List var4 = new List();
      Dictionary var5 = new Dictionary();
      IGenericEnumerator var6 = var1.getShapes().iterator();

      try {
         while (var6.hasNext()) {
            IShape var7 = (IShape)var6.next();
            if (com.aspose.slides.internal.v6g.k5.l6(var7, IAutoShape.class)) {
               IAutoShape var8 = com.aspose.slides.internal.v6g.k5.n5(var7, IAutoShape.class);
               if (var8.getShapeType() == 5) {
                  r8k var9 = a6b.n5((IShape)var8, var2);
                  String var10 = var9.toString();
                  var4.addItem(var10);
               } else if (var8.getShapeType() == 1) {
                  r8k var16 = a6b.l6(var8, var2);
                  String var21 = var16.toString();
                  var4.addItem(var21);
               } else if (var8.getShapeType() == 35) {
                  r8k var17 = a6b.n5(var8, var2);
                  String var22 = var17.toString();
                  var4.addItem(var22);
               } else if (var8.getShapeType() == 0) {
                  e5n var18 = a6b.n5(var2);
                  String var23 = var18.n5(var8, var2);
                  var4.addItem(var23);
                  KeyValuePair var11 = new KeyValuePair<>(var18.l6(), var18.n5());
                  var5.addItem(var11.getKey(), var11.getValue());
               }

               List var19 = this.n5(var8, var2);
               var4.addRange(var19);
            }

            if (com.aspose.slides.internal.v6g.k5.l6(var7, IConnector.class)) {
               IConnector var15 = com.aspose.slides.internal.v6g.k5.n5(var7, IConnector.class);
               List var20 = this.n5(var15, var2);
               var4.addRange(var20);
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var6, IDisposable.class)) {
            var6.dispose();
         }
      }

      var3[0] = var5;
      return var4;
   }

   private String n5(IPictureFrame var1, XamlOptions var2, KeyValuePair<String, byte[]>[] var3) {
      r2w var4 = a6b.n5(var1, var2);
      String var5 = var4.toString();
      if (var4.n5() != null && var4.n5().length > 0) {
         KeyValuePair var6 = new KeyValuePair<>(var4.l6(), var4.n5());
         var6.CloneTo(var3[0]);
      } else {
         var3[0] = new KeyValuePair();
      }

      return var5;
   }

   private List<String> n5(IAutoShape var1, XamlOptions var2) {
      List var3 = new List();
      switch (var1.getShapeType()) {
         case 5:
            r8k var4 = a6b.n5((IShape)var1, var2);
            String var5 = var4.toString();
            var3.addItem(var5);
            break;
         case 35:
            r8k var6 = a6b.n5(var1, var2);
            String var7 = var6.toString();
            var3.addItem(var7);
      }

      if (!com.aspose.slides.ms.System.d1.n5(var1.getTextFrame().getText())) {
         r8k var14 = a6b.n5(var1, var2, this.n5);
         String var15 = var14.toString();
         var3.addItem(var15);
         ITextFrame var16 = var1.getTextFrame();
         IGenericEnumerator var17 = var16.getParagraphs().iterator();

         try {
            while (var17.hasNext()) {
               IParagraph var8 = (IParagraph)var17.next();
               r8k var9 = a6b.n5(var8, var2);
               String var10 = var9.toString();
               var3.addItem(var10);
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var17, IDisposable.class)) {
               var17.dispose();
            }
         }

         var3.addItem(this.l6);
      }

      return var3;
   }

   private List<String> n5(IConnector var1, XamlOptions var2) {
      List var3 = new List();
      switch (var1.getShapeType()) {
         case 1:
            r8k var6 = a6b.l6(var1, var2);
            String var7 = var6.toString();
            var3.addItem(var7);
            break;
         case 5:
            r8k var4 = a6b.n5(var1, var2);
            String var5 = var4.toString();
            var3.addItem(var5);
      }

      return var3;
   }

   @Override
   public final List<String> n5(ILayoutSlide var1, XamlOptions var2) {
      List var3 = new List();
      IGenericEnumerator var4 = var1.getShapes().iterator();

      try {
         while (var4.hasNext()) {
            IShape var5 = (IShape)var4.next();
            if (com.aspose.slides.internal.v6g.k5.l6(var5, IAutoShape.class)) {
               IAutoShape var6 = com.aspose.slides.internal.v6g.k5.n5(var5, IAutoShape.class);
               switch (var6.getShapeType()) {
                  case 1:
                     r8k var9 = a6b.l6(var6, var2);
                     String var10 = var9.toString();
                     var3.addItem(var10);
                     break;
                  case 5:
                     r8k var7 = a6b.n5((IShape)var6, var2);
                     String var8 = var7.toString();
                     var3.addItem(var8);
                     break;
                  case 35:
                     r8k var11 = a6b.n5(var6, var2);
                     String var12 = var11.toString();
                     var3.addItem(var12);
               }
            }

            if (com.aspose.slides.internal.v6g.k5.l6(var5, IConnector.class)) {
               IConnector var16 = com.aspose.slides.internal.v6g.k5.n5(var5, IConnector.class);
               List var17 = this.n5(var16, var2);
               var3.addRange(var17);
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      return var3;
   }

   private String n5(IChart var1, XamlOptions var2, KeyValuePair<String, byte[]>[] var3) {
      e5n var4 = a6b.k5(var2);
      String var5 = var4.n5(var1, var2);
      KeyValuePair var6 = new KeyValuePair<>(var4.l6(), var4.n5());
      var6.CloneTo(var3[0]);
      return var5;
   }
}
