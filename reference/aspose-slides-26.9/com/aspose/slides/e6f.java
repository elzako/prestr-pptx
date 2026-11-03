package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.SortedList;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.DOMResourcesUtils;
import com.aspose.slides.ms.System.IDisposable;

class e6f {
   private static final SortedList<String, e5i> n5 = new SortedList<>();
   private static final SortedList<com.aspose.slides.ms.System.o0, String> l6 = new SortedList<>();

   public static byte[] n5(String var0, IOleEmbeddedDataInfo var1, com.aspose.slides.internal.q7.l6 var2) {
      String var3 = com.aspose.slides.ms.System.d1.a6(var1.getEmbeddedFileExtension());
      var0 = com.aspose.slides.ms.System.d1.a6(var0);
      if (var1.getEmbeddedFileData() == null) {
         throw new ArgumentNullException("data");
      }

      if (!n5().containsKey(var0)) {
         var0 = "package";
      }

      if ("excel.sheet.12".equals(var0) || "xlsx".equals(var3)) {
         return n5(var1.getEmbeddedFileData(), var2);
      } else if ("acroexch.document.dc".equals(var0) || "pdf".equals(var3)) {
         return k5(var1.getEmbeddedFileData(), var0, new com.aspose.slides.ms.System.o0("{b801ca65-a1fc-11d0-85ad-444553540000}"));
      } else if (!"prism10.document".equals(var0) && !"prism".equals(var3)) {
         e5i var4 = n5.get_Item(var0);
         return "0".equals(var4.k5()) && !l6(var1.getEmbeddedFileData()) ? k5(var1.getEmbeddedFileData(), var0) : var1.getEmbeddedFileData();
      } else {
         return k5(var1.getEmbeddedFileData(), var0, new com.aspose.slides.ms.System.o0("{10ff84f8-c7e4-43b3-8613-e9cb9c5c442b}"));
      }
   }

   private static boolean l6(byte[] var0) {
      byte[] var1 = new byte[]{-48, -49, 17, -32, -95, -79, 26, -31};
      return var0.length < 24 ? false : com.aspose.slides.internal.n2d.n5.n5(var0, var1, 8);
   }

   public static byte[] n5(byte[] var0, String var1, com.aspose.slides.ms.System.o0 var2) {
      com.aspose.slides.internal.x1.x8 var3 = new com.aspose.slides.internal.x1.x8();
      var3.n5().l6(var2.n5());
      com.aspose.slides.internal.x1.u9 var4 = k5();
      var3.n5().a6(var4);
      com.aspose.slides.internal.x1.u9 var5 = l6(var0, "EmbeddedOdf");
      var3.n5().a6(var5);
      com.aspose.slides.internal.x1.u9 var6 = n5(var1);
      var3.n5().a6(var6);
      com.aspose.slides.internal.z0k.e2 var7 = new com.aspose.slides.internal.z0k.e2();

      try {
         var3.l6(var7);
         return var7.toArray();
      } finally {
         if (var7 != null) {
            var7.dispose();
         }
      }
   }

   public static byte[] l6(byte[] var0, String var1, com.aspose.slides.ms.System.o0 var2) {
      com.aspose.slides.internal.x1.x8 var3 = new com.aspose.slides.internal.x1.x8();
      var3.n5().l6(var2.n5());
      com.aspose.slides.internal.x1.u9 var4 = l6(var0, "Package");
      var3.n5().a6(var4);
      com.aspose.slides.internal.x1.u9 var5 = n5(var1);
      var3.n5().a6(var5);
      com.aspose.slides.internal.z0k.e2 var6 = new com.aspose.slides.internal.z0k.e2();

      try {
         var3.l6(var6);
         return var6.toArray();
      } finally {
         if (var6 != null) {
            var6.dispose();
         }
      }
   }

   private static byte[] k5(byte[] var0, String var1, com.aspose.slides.ms.System.o0 var2) {
      com.aspose.slides.internal.x1.x8 var3 = new com.aspose.slides.internal.x1.x8();
      var3.n5().l6(var2.n5());
      com.aspose.slides.internal.x1.u9 var4 = k5();
      var3.n5().a6(var4);
      com.aspose.slides.internal.x1.u9 var5 = l6(var0, "CONTENTS");
      var3.n5().a6(var5);
      com.aspose.slides.internal.x1.u9 var6 = n5(var1);
      var3.n5().a6(var6);
      com.aspose.slides.internal.x1.u9 var7 = n5(var0, var1);
      var3.n5().a6(var7);
      com.aspose.slides.internal.z0k.e2 var8 = new com.aspose.slides.internal.z0k.e2();

      try {
         var3.l6(var8);
         return var8.toArray();
      } finally {
         if (var8 != null) {
            var8.dispose();
         }
      }
   }

   private static com.aspose.slides.internal.x1.u9 n5(byte[] var0, String var1) {
      com.aspose.slides.internal.z0k.e2 var2 = new com.aspose.slides.internal.z0k.e2();

      try {
         com.aspose.slides.internal.z0k.l6 var3 = new com.aspose.slides.internal.z0k.l6(var2);

         try {
            var3.n5(new byte[]{-1, -1, -1, -1});
            var3.l6(3);
            var3.l6(4);
            var3.l6(4);
            var3.n5(new byte[]{-1, -1, -1, -1});
            var3.l6(7);
            var3.l6(0);
            com.aspose.slides.internal.z0k.e2 var4 = ImageCollection.l6(DOMResourcesUtils.getResourceStream("OleIconTemplate.wmf"));
            com.aspose.slides.internal.o9b.l6 var5 = com.aspose.slides.internal.y6.l6.n5(var4).u3();

            try {
               var3.l6(var5.e2());
               var3.l6(var5.h0());
               long var6 = var4.getLength();
               var3.l6((int)var6);
               var3.n5(var4.toArray());
               var3.n5(new byte[]{73, 78, 65, 78});
               var3.l6(0);
            } finally {
               var5.dispose();
            }
         } finally {
            if (var3 != null) {
               var3.dispose();
            }
         }

         com.aspose.slides.internal.x1.u9 var23 = new com.aspose.slides.internal.x1.u9("\u0002OlePres000");
         var23.n5(var2.toArray());
         return var23;
      } finally {
         if (var2 != null) {
            var2.dispose();
         }
      }
   }

   private static com.aspose.slides.internal.x1.u9 k5() {
      com.aspose.slides.internal.z0k.e2 var0 = new com.aspose.slides.internal.z0k.e2();

      try {
         com.aspose.slides.internal.z0k.l6 var1 = new com.aspose.slides.internal.z0k.l6(var0);

         try {
            var1.l6(33554433);
            var1.n5(new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0});
         } finally {
            if (var1 != null) {
               var1.dispose();
            }
         }

         com.aspose.slides.internal.x1.u9 var2 = new com.aspose.slides.internal.x1.u9("\u0001Ole");
         var2.n5(var0.toArray());
         return var2;
      } finally {
         if (var0 != null) {
            var0.dispose();
         }
      }
   }

   private static com.aspose.slides.internal.x1.u9 l6(byte[] var0, String var1) {
      com.aspose.slides.internal.z0k.e2 var2 = new com.aspose.slides.internal.z0k.e2();

      try {
         com.aspose.slides.internal.z0k.l6 var3 = new com.aspose.slides.internal.z0k.l6(var2);

         try {
            var3.n5(var0);
         } finally {
            if (var3 != null) {
               var3.dispose();
            }
         }

         com.aspose.slides.internal.x1.u9 var4 = new com.aspose.slides.internal.x1.u9(var1);
         var4.n5(var2.toArray());
         return var4;
      } finally {
         if (var2 != null) {
            var2.dispose();
         }
      }
   }

   private static byte[] k5(byte[] var0, String var1) {
      com.aspose.slides.internal.x1.x8 var2 = new com.aspose.slides.internal.x1.x8();
      var2.n5().l6(new com.aspose.slides.ms.System.o0("{0003000C-0000-0000-C000-000000000046}").n5());
      com.aspose.slides.internal.x1.u9 var3 = u3();
      var2.n5().a6(var3);
      com.aspose.slides.internal.x1.u9 var4 = u3(var0, var1);
      var2.n5().a6(var4);
      com.aspose.slides.internal.z0k.e2 var5 = new com.aspose.slides.internal.z0k.e2();

      try {
         var2.l6(var5);
         return var5.toArray();
      } finally {
         if (var5 != null) {
            var5.dispose();
         }
      }
   }

   private static com.aspose.slides.internal.x1.u9 u3(byte[] var0, String var1) {
      com.aspose.slides.internal.z0k.e2 var2 = new com.aspose.slides.internal.z0k.e2();

      try {
         com.aspose.slides.internal.z0k.l6 var3 = new com.aspose.slides.internal.z0k.l6(var2);

         try {
            e5i var4 = n5().get_Item(com.aspose.slides.ms.System.d1.a6(var1));
            String var5 = com.aspose.slides.ms.System.d1.n5(new String[]{n5(var0), var4.n5()});
            int var6 = 6 + var5.length() + 1 + var5.length() + 1 + 1 + 1 + 2 + 4 + var5.length() + 1 + 4 + var0.length;
            var3.l6(var6 - 4);
            var3.n5((short)2);
            com.aspose.slides.internal.n8e.v4.n5(var3, var5);
            com.aspose.slides.internal.n8e.v4.n5(var3, var5);
            var3.n5((byte)0);
            var3.n5((byte)0);
            var3.n5((short)3);
            var3.l6(var5.length() + 1);
            com.aspose.slides.internal.n8e.v4.n5(var3, var5);
            var3.l6(var0.length);
            var3.n5(var0);
         } finally {
            if (var3 != null) {
               var3.dispose();
            }
         }

         com.aspose.slides.internal.x1.u9 var15 = new com.aspose.slides.internal.x1.u9("\u0001Ole10Native");
         var15.n5(var2.toArray());
         return var15;
      } finally {
         if (var2 != null) {
            var2.dispose();
         }
      }
   }

   static String n5(byte[] var0) {
      com.aspose.slides.internal.n8e.q1 var1 = new com.aspose.slides.internal.n8e.q1(var0);
      if (var1.n5()) {
         return com.aspose.slides.ms.System.d1.n5("video.{0}", new Object[]{var1.k5()});
      }

      com.aspose.slides.internal.n8e.a6 var2 = new com.aspose.slides.internal.n8e.a6(var0);
      return var2.k5() ? com.aspose.slides.ms.System.d1.n5("audio.{0}", new Object[]{var2.l6()}) : "package.bin";
   }

   private static com.aspose.slides.internal.x1.u9 u3() {
      com.aspose.slides.internal.z0k.e2 var0 = new com.aspose.slides.internal.z0k.e2();

      try {
         com.aspose.slides.internal.z0k.l6 var1 = new com.aspose.slides.internal.z0k.l6(var0);

         try {
            var1.n5(new byte[]{1, 0, -2, -1});
            var1.n5(new byte[]{3, 10, 0, 0});
            var1.n5(new byte[]{-1, -1, -1, -1, 12, 0, 3, 0, 0, 0, 0, 0, -64, 0, 0, 0, 0, 0, 0, 70});
            String var2 = "OLE Package";
            var1.l6("OLE Package".length() + 1);

            for (byte var6 : com.aspose.slides.internal.l7h.j5.e2().u3("OLE Package")) {
               var1.n5(var6);
            }

            var1.n5((byte)0);
            var1.n5(0L);
         } finally {
            if (var1 != null) {
               var1.dispose();
            }
         }

         com.aspose.slides.internal.x1.u9 var15 = new com.aspose.slides.internal.x1.u9("\u0001CompObj");
         var15.n5(var0.toArray());
         return var15;
      } finally {
         if (var0 != null) {
            var0.dispose();
         }
      }
   }

   private static com.aspose.slides.internal.x1.u9 n5(String var0) {
      e5i var1 = n5().get_Item(com.aspose.slides.ms.System.d1.a6(var0));
      com.aspose.slides.internal.z0k.e2 var2 = new com.aspose.slides.internal.z0k.e2();

      try {
         com.aspose.slides.internal.z0k.l6 var3 = new com.aspose.slides.internal.z0k.l6(var2);

         try {
            var3.n5(new byte[]{1, 0, -2, -1});
            var3.n5(new byte[]{3, 10, 0, 0});
            var3.n5(new byte[]{-1, -1, -1, -1, 101, -54, 1, -72, -4, -95, -48, 17, -123, -83, 68, 69, 83, 84, 0, 0});
            String var4 = var1.a6();
            var3.l6(var4.length() + 1);

            for (byte var8 : com.aspose.slides.internal.l7h.j5.e2().u3(var4)) {
               var3.n5(var8);
            }

            var3.n5((byte)0);
            var3.n5(0L);
            String var19 = var0;
            var3.l6(var19.length() + 1);

            for (byte var9 : com.aspose.slides.internal.l7h.j5.e2().u3(var19)) {
               var3.n5(var9);
            }

            var3.n5((byte)0);
            var3.n5(new byte[]{-12, 57, -78, 113, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0});
         } finally {
            if (var3 != null) {
               var3.dispose();
            }
         }

         com.aspose.slides.internal.x1.u9 var18 = new com.aspose.slides.internal.x1.u9("\u0001CompObj");
         var18.n5(var2.toArray());
         return var18;
      } finally {
         if (var2 != null) {
            var2.dispose();
         }
      }
   }

   private static byte[] n5(byte[] var0, com.aspose.slides.internal.q7.l6 var1) {
      com.aspose.slides.internal.z0k.e2 var2 = new com.aspose.slides.internal.z0k.e2(var0);

      try {
         ChartDataWorkbook var3 = new ChartDataWorkbook(null, var2, var1, InterruptionToken.getNone(), false);
         if (n5(var3)) {
            return var0;
         }

         ChartDataWorksheet var4 = l6(var3);
         if (var4 == null) {
            return var0;
         }

         n5(var3, var4);
         return k5(var3);
      } finally {
         if (var2 != null) {
            var2.dispose();
         }
      }
   }

   private static boolean n5(ChartDataWorkbook var0) {
      return var0.h0().s7() != null && !com.aspose.slides.ms.System.d1.n5(var0.h0().s7().n5());
   }

   private static void n5(ChartDataWorkbook var0, ChartDataWorksheet var1) {
      ChartDataCell var2 = n5(var1);
      if (var2 != null) {
         com.aspose.slides.internal.k4y.f2e var3 = null;
         com.aspose.slides.internal.k4y.f2e[] var4 = new com.aspose.slides.internal.k4y.f2e[]{var3};
         boolean var5 = n5(var2, var1, var4);
         var3 = var4[0];
         String var7;
         if (var5) {
            String var6 = n5(var2, var3);
            var7 = n5(var2.a6(), var6);
         } else {
            var7 = var2.a6();
         }

         n5(var0, com.aspose.slides.ms.System.d1.n5("A1:{0}", new Object[]{var7}));
      } else if (var1.a6().l6() != null) {
         n5(var0, var1.a6().l6().n5());
      }
   }

   private static void n5(ChartDataWorkbook var0, String var1) {
      if (var0.h0().s7() == null) {
         var0.h0().n5(new com.aspose.slides.internal.k4y.m0j());
      }

      var0.h0().s7().n5(var1);
   }

   private static boolean n5(ChartDataCell var0, ChartDataWorksheet var1, com.aspose.slides.internal.k4y.f2e[] var2) {
      var2[0] = null;
      if (var1.a6().e2() == null) {
         return false;
      }

      for (com.aspose.slides.internal.k4y.f2e var6 : var1.a6().e2().n5()) {
         if (com.aspose.slides.ms.System.d1.t2(var6.n5(), var0.a6())) {
            var2[0] = var6;
            return true;
         }
      }

      return false;
   }

   private static String n5(ChartDataCell var0, com.aspose.slides.internal.k4y.f2e var1) {
      if (!com.aspose.slides.ms.System.d1.t2(var1.n5(), var0.a6())) {
         throw new InvalidOperationException();
      } else {
         String[] var2 = com.aspose.slides.ms.System.d1.n5(var1.n5(), ':');
         if (var2.length != 2) {
            throw new InvalidOperationException();
         } else {
            return !com.aspose.slides.ms.System.d1.a6(var2[0], var0.a6()) ? var2[0] : var2[1];
         }
      }
   }

   private static ChartDataCell n5(ChartDataWorksheet var0) {
      ChartDataCell var1 = null;
      IGenericEnumerator var2 = var0.l6().iterator();

      try {
         while (var2.hasNext()) {
            KeyValuePair var3 = (KeyValuePair)var2.next();
            IGenericEnumerator var4 = ((SortedList)var3.getValue()).getValues().iterator();

            try {
               while (var4.hasNext()) {
                  SortedList var5 = (SortedList)var4.next();
                  IGenericEnumerator var6 = var5.iterator();

                  try {
                     while (var6.hasNext()) {
                        KeyValuePair var7 = (KeyValuePair)var6.next();
                        if (((ChartDataCell)var7.getValue()).getValue() != null) {
                           if (var1 == null) {
                              var1 = (ChartDataCell)var7.getValue();
                           } else {
                              var1 = n5(var1.a6(), ((ChartDataCell)var7.getValue()).a6(), var1, (ChartDataCell)var7.getValue());
                           }
                        }
                     }
                  } finally {
                     if (com.aspose.slides.internal.v6g.k5.n5(var6, IDisposable.class)) {
                        var6.dispose();
                     }
                  }
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
                  var4.dispose();
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      return var1;
   }

   private static String n5(String var0, String var1) {
      return n5(var0, var1, var0, var1);
   }

   private static <T> T n5(String var0, String var1, T var2, T var3) {
      if (var0.length() < var1.length()) {
         return (T)var3;
      }

      if (var1.length() < var0.length()) {
         return (T)var2;
      }

      int var4 = com.aspose.slides.ms.System.d1.a6(var0, var1, (short)4);
      return (T)(var4 < 0 ? var3 : var2);
   }

   private static ChartDataWorksheet l6(ChartDataWorkbook var0) {
      ChartDataWorksheet var1 = null;
      IGenericEnumerator var2 = var0.getWorksheets().iterator();

      try {
         while (var2.hasNext()) {
            ChartDataWorksheet var3 = (ChartDataWorksheet)var2.next();
            if (var1 == null || (var1.k5() & 4294967295L) > (var3.k5() & 4294967295L)) {
               var1 = var3;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      return var1;
   }

   private static byte[] k5(ChartDataWorkbook var0) {
      com.aspose.slides.internal.z0k.e2 var1 = new com.aspose.slides.internal.z0k.e2();

      try {
         var0.n5(var1);
         return var1.toArray();
      } finally {
         if (var1 != null) {
            var1.dispose();
         }
      }
   }

   public static SortedList<String, e5i> n5() {
      return n5;
   }

   public static SortedList<com.aspose.slides.ms.System.o0, String> l6() {
      return l6;
   }

   static {
      n5.addItem("excel.sheet.12", new e5i(".xlsx", new com.aspose.slides.internal.c8m.j4(), "1", "Microsoft Excel Worksheet"));
      n5.addItem("excel.sheet.8", new e5i(".xls", new com.aspose.slides.internal.c8m.g7(), "1", "Microsoft Excel 97-2003 Worksheet"));
      n5.addItem("excel.chart.8", new e5i(".xls", new com.aspose.slides.internal.c8m.g7(), "1", "Microsoft Excel 97-2003  Worksheet"));
      n5.addItem("word.document.12", new e5i(".docx", new com.aspose.slides.internal.c8m.o6(), "1", "Microsoft Word Document"));
      n5.addItem("word.document.8", new e5i(".doc", new com.aspose.slides.internal.c8m.k1(), "1", "Microsoft Word 97-2003 Document"));
      n5.addItem("powerpoint.show.12", new e5i(".pptx", new com.aspose.slides.internal.c8m.l5(), "1", "Microsoft PowerPoint Presentation"));
      n5.addItem(
         "powerpoint.showmacroenabled.12", new e5i(".pptm", new com.aspose.slides.internal.c8m.y6(), "1", "Microsoft PowerPoint Macro-Enabled Presentation")
      );
      n5.addItem("powerpoint.show.8", new e5i(".ppt", new com.aspose.slides.internal.c8m.n7(), "1", "Microsoft PowerPoint 97-2003 Presentation"));
      n5.addItem("powerpoint.slide.12", new e5i(".sldx", new com.aspose.slides.internal.c8m.u2(), "1", "Microsoft PowerPoint Slide"));
      n5.addItem("powerpoint.slide.8", new e5i(".ppt", new com.aspose.slides.internal.c8m.u2(), "1", "Microsoft PowerPoint Slide"));
      n5.addItem("excel.sheetmacroenabled.12", new e5i(".xlsm", new com.aspose.slides.internal.c8m.v3(), "1", "Microsoft Excel Macro-Enabled Worksheet"));
      n5.addItem("excel.sheetbinarymacroenabled.12", new e5i(".xlsb", new com.aspose.slides.internal.c8m.v8(), "1", "Microsoft Excel Binary Worksheet"));
      n5.addItem("paint.picture", new e5i(".jpg", new com.aspose.slides.internal.c8m.y9(), "0", "Bitmap Image"));
      n5.addItem("wordpad.document.1", new e5i(".rtf", new com.aspose.slides.internal.c8m.y9(), "0", "WordPad Document"));
      n5.addItem("msgraph.chart.8", new e5i(".gra", new com.aspose.slides.internal.c8m.y9(), "1", "Microsoft Graph Chart"));
      n5.addItem("opendocument.mathdocument.1", new e5i(".binn", new com.aspose.slides.internal.c8m.y9(), "1", "OpenDocument Math Document"));
      n5.addItem("package", new e5i(".bin", new com.aspose.slides.internal.c8m.y9(), "0", "Packager Shell Object"));
      n5.addItem("acroexch.document.dc", new e5i(".pdf", new com.aspose.slides.internal.c8m.y9(), "0", "Acrobat Document"));
      n5.addItem("word.opendocumenttext.12", new e5i(".odt", new com.aspose.slides.internal.c8m.y9(), "0", "OpenDocument Text"));
      n5.addItem("excel.opendocumentspreadsheet.12", new e5i(".ods", new com.aspose.slides.internal.c8m.y9(), "0", "OpenDocument Spreadsheet"));
      n5.addItem("powerpoint.opendocumentpresentation.12", new e5i(".odp", new com.aspose.slides.internal.c8m.y9(), "0", "OpenDocument Presentation"));
      n5.addItem("msphotoed.3", new e5i(".bin", new com.aspose.slides.internal.c8m.y9(), "0", "Microsoft Photo Editor Photo"));
      n5.addItem("prism10.document", new e5i(".prism", new com.aspose.slides.internal.c8m.y9(), "0", "Prism 10 Document"));
      n5.addItem("tclayout.activedocument.1", new e5i(".bin", new com.aspose.slides.internal.c8m.y9(), "1", "Think-cell Add-in"));
      l6.addItem(new com.aspose.slides.ms.System.o0("{0003000c-0000-0000-c000-000000000046}"), "package");
      l6.addItem(new com.aspose.slides.ms.System.o0("{f20da720-c02f-11ce-927b-0800095ae340}"), "package");
      l6.addItem(new com.aspose.slides.ms.System.o0("{b801ca65-a1fc-11d0-85ad-444553540000}"), "acroexch.document.dc");
      l6.addItem(new com.aspose.slides.ms.System.o0("{f4754c9b-64f5-4b40-8af4-679732ac0607}"), "word.document.12");
      l6.addItem(new com.aspose.slides.ms.System.o0("{73fddc80-aea9-101a-98a7-00aa00374959}"), "wordpad.document.1");
      l6.addItem(new com.aspose.slides.ms.System.o0("{0003000a-0000-0000-c000-000000000046}"), "paint.picture");
      l6.addItem(new com.aspose.slides.ms.System.o0("{00020803-0000-0000-c000-000000000046}"), "msgraph.chart.8");
      l6.addItem(new com.aspose.slides.ms.System.o0("{64818d11-4f9b-11cf-86ea-00aa00b929e8}"), "powerpoint.slide.8");
      l6.addItem(new com.aspose.slides.ms.System.o0("{cf4f55f4-8f87-4d47-80bb-5808164bb3f8}"), "powerpoint.show.12");
      l6.addItem(new com.aspose.slides.ms.System.o0("{00020820-0000-0000-c000-000000000046}"), "excel.sheet.8");
      l6.addItem(new com.aspose.slides.ms.System.o0("{00020833-0000-0000-c000-000000000046}"), "excel.sheetbinarymacroenabled.12");
      l6.addItem(new com.aspose.slides.ms.System.o0("{00020830-0000-0000-c000-000000000046}"), "excel.sheet.12");
      l6.addItem(new com.aspose.slides.ms.System.o0("{64818d10-4f9b-11cf-86ea-00aa00b929e8}"), "powerpoint.show.8");
      l6.addItem(new com.aspose.slides.ms.System.o0("{00020906-0000-0000-c000-000000000046}"), "word.document.8");
      l6.addItem(new com.aspose.slides.ms.System.o0("{d2d59cd1-0a6a-4d36-ae20-47817077d57c}"), "opendocument.mathdocument.1");
      l6.addItem(new com.aspose.slides.ms.System.o0("{10ff84f8-c7e4-43b3-8613-e9cb9c5c442b}"), "prism10.document");
      l6.addItem(new com.aspose.slides.ms.System.o0("{3eab3858-a0e0-4a3b-a405-f4d525e85265}"), "tclayout.activedocument.1");
   }
}
