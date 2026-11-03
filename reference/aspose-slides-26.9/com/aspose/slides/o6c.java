package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.ms.System.IDisposable;

class o6c {
   public static <T> String n5(T var0, TemplateContext<T> var1) {
      if (!com.aspose.slides.internal.v6g.k5.l6(var0, Shape.class)) {
         throw new InvalidOperationException("Object of Shape class expected");
      }

      if (var1.getGlobal().<Boolean>get("embedImages")) {
         Shape var18 = com.aspose.slides.internal.v6g.k5.n5(var0, Shape.class);
         com.aspose.slides.internal.z0k.e2 var19 = new com.aspose.slides.internal.z0k.e2();

         try {
            IImage var20 = n5((IShape)var18);

            try {
               if (var20 == null) {
                  return "none";
               }

               ((u4i)var20).n5(var19, 6);
               return com.aspose.slides.ms.System.d1.n5("url('data:image/png;base64, ", com.aspose.slides.ms.System.z3.n5(var19.toArray()), "')");
            } finally {
               if (var20 != null) {
                  var20.dispose();
               }
            }
         } finally {
            if (var19 != null) {
               var19.dispose();
            }
         }
      } else {
         String var2 = "";
         String var3 = var1.getGlobal().get("slidesPath");

         try {
            var2 = var1.getOutput().getResourcePath(com.aspose.slides.internal.v6g.k5.n5(var0, Shape.class));
         } catch (ArgumentException var16) {
            if (!com.aspose.slides.internal.v6g.k5.l6(var0, OleObjectFrame.class)
               || com.aspose.slides.internal.v6g.k5.n5(var0, OleObjectFrame.class).getSubstitutePictureFormat() == null
               || com.aspose.slides.internal.v6g.k5.n5(var0, OleObjectFrame.class).getSubstitutePictureFormat().getPicture() == null) {
               throw var16;
            }

            var2 = var1.getOutput()
               .getResourcePath(com.aspose.slides.internal.v6g.k5.n5(var0, OleObjectFrame.class).getSubstitutePictureFormat().getPicture().getImage());
         }

         String var4 = n5(var2, var3);
         return com.aspose.slides.ms.System.d1.n5("url(", var4, ");");
      }
   }

   public static String n5(String var0, String var1) {
      if (!com.aspose.slides.internal.z0k.z1.h0(var0)) {
         var0 = com.aspose.slides.ms.System.d1.n5(new String[]{"C:\\", var0});
      }

      if (!com.aspose.slides.internal.z0k.z1.h0(var1)) {
         var1 = com.aspose.slides.ms.System.d1.n5(new String[]{"C:\\", var1});
      }

      if (!com.aspose.slides.ms.System.d1.k5(var1, "\\")) {
         var1 = com.aspose.slides.ms.System.d1.n5(var1, "\\");
      }

      com.aspose.slides.ms.System.r8 var2 = new com.aspose.slides.ms.System.r8(var1);
      com.aspose.slides.ms.System.r8 var3 = new com.aspose.slides.ms.System.r8(var0);
      com.aspose.slides.ms.System.r8 var4 = var2.n5(var3);
      return com.aspose.slides.ms.System.d1.n5(com.aspose.slides.ms.System.r8.x8(var4.toString()), '\\', '/');
   }

   public static <T> List<T> n5(Class<T> var0, IPresentation var1) {
      List var2 = new List();
      IGenericEnumerator var3 = var1.getSlides().iterator();

      try {
         while (var3.hasNext()) {
            ISlide var4 = (ISlide)var3.next();
            IGenericEnumerator var5 = var4.getShapes().iterator();

            try {
               while (var5.hasNext()) {
                  IShape var6 = (IShape)var5.next();
                  if (com.aspose.slides.internal.v6g.k5.l6(var6, var0)) {
                     var2.addItem(var6);
                  }
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var5, IDisposable.class)) {
                  var5.dispose();
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }

      IGenericEnumerator var55 = var1.getLayoutSlides().iterator();

      try {
         while (var55.hasNext()) {
            ILayoutSlide var56 = (ILayoutSlide)var55.next();
            IGenericEnumerator var58 = var56.getShapes().iterator();

            try {
               while (var58.hasNext()) {
                  IShape var7 = (IShape)var58.next();
                  if (com.aspose.slides.internal.v6g.k5.l6(var7, var0)) {
                     var2.addItem(var7);
                  }
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var58, IDisposable.class)) {
                  var58.dispose();
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var55, IDisposable.class)) {
            var55.dispose();
         }
      }

      IGenericEnumerator var57 = var1.getMasters().iterator();

      try {
         while (var57.hasNext()) {
            IMasterSlide var59 = (IMasterSlide)var57.next();
            IGenericEnumerator var60 = var59.getShapes().iterator();

            try {
               while (var60.hasNext()) {
                  IShape var8 = (IShape)var60.next();
                  if (com.aspose.slides.internal.v6g.k5.l6(var8, var0)) {
                     var2.addItem(var8);
                  }
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var60, IDisposable.class)) {
                  var60.dispose();
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var57, IDisposable.class)) {
            var57.dispose();
         }
      }

      return var2;
   }

   private static IImage n5(IShape var0) {
      AutoShape var1 = com.aspose.slides.internal.v6g.k5.n5(var0, AutoShape.class);
      IImage var6;
      if (var1 != null && var1.getTextFrame() != null && !com.aspose.slides.ms.System.d1.n5(var1.getTextFrame().getText())) {
         List var2 = new List();
         IGenericEnumerator var3 = var1.getTextFrame().getParagraphs().iterator();

         try {
            while (var3.hasNext()) {
               Paragraph var4 = (Paragraph)var3.next();
               var2.addItem(new Paragraph(var4));
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
               var3.dispose();
            }
         }

         try {
            var1.getTextFrame().getParagraphs().clear();
            var6 = l6(var1) ? var1.getImage(2, 1.0F, 1.0F) : var1.getImage();
         } finally {
            List$Enumerator var9 = var2.iterator();

            try {
               while (var9.hasNext()) {
                  Paragraph var10 = (Paragraph)var9.next();
                  var1.getTextFrame().getParagraphs().add(var10);
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var9, IDisposable.class)) {
                  var9.dispose();
               }
            }
         }
      } else if (com.aspose.slides.internal.v6g.k5.l6(var0, IConnector.class)) {
         var6 = ((Connector)var0).getImage(2, 1.0F, 1.0F);
      } else {
         var6 = ((Shape)var0).getImage();
      }

      return var6;
   }

   public static String n5(Shape var0, com.aspose.slides.internal.o9b.j5 var1) {
      int var2 = com.aspose.slides.internal.v6g.k5.u3(var0.getX(), 13);
      int var3 = com.aspose.slides.internal.v6g.k5.u3(var0.getY(), 13);
      int var4 = com.aspose.slides.internal.v6g.k5.u3(var0.getWidth(), 13);
      int var5 = com.aspose.slides.internal.v6g.k5.u3(var0.getHeight(), 13);
      if (com.aspose.slides.internal.v6g.k5.l6(var0, Connector.class) && var5 == 0) {
         Connector var6 = (Connector)var0;
         if (!com.aspose.slides.ms.System.d2.k5(var6.getLineFormat().getWidth())) {
            var5 = com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.internal.v6g.k5.n5(var0, Connector.class).getLineFormat().getWidth(), 14);
         }
      }

      return com.aspose.slides.ms.System.d1.n5("left: {0}px; top: {1}px; width: {2}px; height: {3}px;",new Object[]{ var2, var3, var4, var5});
   }

   public static String n5(Shape var0) {
      com.aspose.slides.internal.o9b.y2 var1 = k5(var0).n3();
      if (com.aspose.slides.internal.o9b.y2.k5(var1, com.aspose.slides.internal.o9b.y2.n5)) {
         com.aspose.slides.internal.o9b.y1 var2 = var0.e5().s7().y4();
         com.aspose.slides.internal.o9b.y2.l6(var2.y4()).u3(var1);
      }

      return com.aspose.slides.ms.System.d1.n5(
         "position: absolute; z-index: 0; left: {0}px; top: {1}px; width: {2}px; height: {3}px;",new Object[]{
         com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.k5(var1.u3() - var0.getX()), 14),
         com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.k5(var1.c8() - var0.getY()), 14),
         var1.t2(),
         var1.l6()
      });
   }

   public static boolean l6(Shape var0) {
      byte var1 = 2;
      AutoShape var2 = com.aspose.slides.internal.v6g.k5.n5(var0, AutoShape.class);
      if (var2 == null) {
         return false;
      }

      switch (var2.getShapeType()) {
         case 117:
         case 118:
         case 119:
         case 120:
            com.aspose.slides.internal.o9b.y2 var3 = k5(var0).n3();
            if (com.aspose.slides.internal.o9b.y2.k5(var3, com.aspose.slides.internal.o9b.y2.n5)) {
               return false;
            }

            com.aspose.slides.internal.o9b.y2 var4 = com.aspose.slides.internal.o9b.y2.l6(var0.e5().s7().y4()).n3();
            return var3.u3() < var4.u3() - 2 || var3.c8() < var4.c8() - 2 || var3.u9() > var4.u9() + 2 || var3.n5() > var4.n5() + 2;
         default:
            return false;
      }
   }

   private static com.aspose.slides.internal.o9b.y2 k5(Shape var0) {
      AutoShape var1 = com.aspose.slides.internal.v6g.k5.n5(var0, AutoShape.class);
      if (var1 != null && var1.getTextFrame() != null && !com.aspose.slides.ms.System.d1.n5(var1.getTextFrame().getText())) {
         List var2 = new List();
         IGenericEnumerator var3 = var1.getTextFrame().getParagraphs().iterator();

         try {
            while (var3.hasNext()) {
               Paragraph var4 = (Paragraph)var3.next();
               var2.addItem(new Paragraph(var4));
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
               var3.dispose();
            }
         }

         try {
            var1.getTextFrame().getParagraphs().clear();
            return u3(var1);
         } finally {
            List$Enumerator var9 = var2.iterator();

            try {
               while (var9.hasNext()) {
                  Paragraph var10 = (Paragraph)var9.next();
                  var1.getTextFrame().getParagraphs().add(var10);
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var9, IDisposable.class)) {
                  var9.dispose();
               }
            }
         }
      } else {
         return u3(var0);
      }
   }

   private static com.aspose.slides.internal.o9b.y2 u3(Shape var0) {
      com.aspose.slides.internal.o9b.l6 var1 = var0.n5(0, 1.0F, 1.0F);

      try {
         return com.aspose.slides.internal.n8e.k7.l6(var1);
      } finally {
         if (var1 != null) {
            var1.dispose();
         }
      }
   }
}
