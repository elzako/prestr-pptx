package com.aspose.slides;

class n3 {
   public static <TLocalData, TEffectiveData extends x8<TLocalData, TEffectiveData>> TEffectiveData n5(Class<TEffectiveData> var0, TLocalData var1) {
      return (TEffectiveData)n5(var0, (q1v)var1);
   }

   public static i7b n5(Class var0, q1v var1) {
      if (var0 == m8.class) {
         return m8.n5((Background)var1);
      } else if (var0 == g9.class) {
         return g9.n5((BulletFormat)var1);
      } else if (var0 == f1s.class) {
         return f1s.n5((CellFormat)var1);
      } else if (var0 == d2n.class) {
         return d2n.n5((ChartPortionFormat)var1);
      } else if (var0 == j8o.class) {
         return j8o.n5((ColumnFormat)var1);
      } else if (var0 == d0e.class) {
         return d0e.n5((EffectFormat)var1);
      } else if (var0 == f6a.class) {
         return f6a.l6((FillFormat)var1);
      } else if (var0 == t8r.class) {
         return t8r.n5((LineFormat)var1);
      } else if (var0 == t3x.class) {
         return t3x.n5((ParagraphFormat)var1);
      } else if (var0 == c9g.class) {
         return c9g.n5((PortionFormat)var1);
      } else if (var0 == j5h.class) {
         return j5h.n5((RowFormat)var1);
      } else if (var0 == u3l.class) {
         return u3l.n5((TableFormat)var1);
      } else if (var0 == h9z.class) {
         return h9z.n5((TextFrameFormat)var1);
      } else if (var0 == n1x.class) {
         return n1x.n5((TextStyle)var1);
      } else {
         return var0 == h3g.class ? h3g.n5((ThreeDFormat)var1) : null;
      }
   }

   public static boolean n5(q1v var0) {
      if (com.aspose.slides.internal.v6g.k5.l6(var0, CellFormat.class)) {
         return f1s.l6(com.aspose.slides.internal.v6g.k5.n5(var0, CellFormat.class));
      } else if (com.aspose.slides.internal.v6g.k5.l6(var0, ColumnFormat.class) || com.aspose.slides.internal.v6g.k5.l6(var0, RowFormat.class)) {
         return true;
      } else {
         return com.aspose.slides.internal.v6g.k5.l6(var0, ParagraphFormat.class)
            ? t3x.l6(com.aspose.slides.internal.v6g.k5.n5(var0, ParagraphFormat.class))
            : false;
      }
   }

   public static boolean l6(q1v var0) {
      if (com.aspose.slides.internal.v6g.k5.l6(var0, PortionFormat.class)) {
         return c9g.n5((r0g)(PortionFormat)var0);
      } else if (com.aspose.slides.internal.v6g.k5.l6(var0, ChartPortionFormat.class)) {
         return d2n.k5((ChartPortionFormat)var0);
      } else if (com.aspose.slides.internal.v6g.k5.l6(var0, ColumnFormat.class)) {
         return j8o.l6((ColumnFormat)var0);
      } else if (com.aspose.slides.internal.v6g.k5.l6(var0, RowFormat.class)) {
         return j5h.l6((RowFormat)var0);
      } else if (com.aspose.slides.internal.v6g.k5.l6(var0, TableFormat.class)) {
         return u3l.l6((TableFormat)var0);
      } else if (com.aspose.slides.internal.v6g.k5.l6(var0, FillFormat.class)) {
         return f6a.u3((FillFormat)var0);
      } else {
         return com.aspose.slides.internal.v6g.k5.l6(var0, LineFormat.class) ? t8r.k5((LineFormat)var0) : false;
      }
   }
}
