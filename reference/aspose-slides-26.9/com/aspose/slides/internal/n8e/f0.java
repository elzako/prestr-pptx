package com.aspose.slides.internal.n8e;

import com.aspose.slides.Collections.Generic.List;

public class f0 {
   public static final z8 n5;
   public static final char[] l6 = com.aspose.slides.ms.System.d1.c8("http://schemas.microsoft.com/office/powerpoint/2010/main");
   static final char[] k5 = com.aspose.slides.ms.System.d1.c8(
      com.aspose.slides.ms.System.d1.n5(" xmlns:xml=\"{0}\" xml:space=\"preserve\"", new Object[]{"http://www.w3.org/XML/1998/namespace"})
   );

   static {
      List var0 = new List();
      var0.addItem(new m3("http://schemas.openxmlformats.org/officeDocument/2006/relationships"));
      var0.addItem(new m3("http://schemas.openxmlformats.org/presentationml/2006/main"));
      var0.addItem(new m3("http://schemas.openxmlformats.org/drawingml/2006/main"));
      var0.addItem(new m3("http://schemas.microsoft.com/office/drawing/2007/8/2/chart"));
      var0.addItem(new m3("http://schemas.microsoft.com/office/powerpoint/2016/slidezoom"));
      var0.addItem(new m3("http://schemas.microsoft.com/office/2006/activeX"));
      var0.addItem(new m3("http://schemas.microsoft.com/office/powerpoint/2010/main", new String[]{"transition", "contentPart"}));
      var0.addItem(new m3("http://schemas.microsoft.com/office/powerpoint/2012/main"));
      var0.addItem(new m3("http://schemas.microsoft.com/office/powerpoint/2015/09/main"));
      var0.addItem(new m3("http://schemas.microsoft.com/office/drawing/2015/9/8/chartex"));
      var0.addItem(new m3("http://schemas.microsoft.com/office/drawing/2015/10/21/chartex"));
      var0.addItem(new m3("http://schemas.microsoft.com/office/drawing/2016/5/10/chartex"));
      var0.addItem(new m3("http://schemas.microsoft.com/office/drawing/2010/main"));
      n5 = new z8(var0);
   }
}
