package com.aspose.slides;

import java.io.InputStream;

public interface IShapeCollection extends IGenericCollection<IShape> {
   IShape get_Item(int var1);

   IGroupShape getParentGroup();

   IChart addChart(int var1, float var2, float var3, float var4, float var5);

   IChart addChart(int var1, float var2, float var3, float var4, float var5, boolean var6);

   ISmartArt addSmartArt(float var1, float var2, float var3, float var4, int var5);

   IChart insertChart(int var1, float var2, float var3, float var4, float var5, int var6);

   IChart insertChart(int var1, float var2, float var3, float var4, float var5, int var6, boolean var7);

   IOleObjectFrame addOleObjectFrame(float var1, float var2, float var3, float var4, IOleEmbeddedDataInfo var5);

   IOleObjectFrame addOleObjectFrame(float var1, float var2, float var3, float var4, String var5, String var6);

   IOleObjectFrame insertOleObjectFrame(int var1, float var2, float var3, float var4, float var5, IOleEmbeddedDataInfo var6);

   IOleObjectFrame insertOleObjectFrame(int var1, float var2, float var3, float var4, float var5, String var6, String var7);

   IZoomFrame addZoomFrame(float var1, float var2, float var3, float var4, ISlide var5);

   IZoomFrame addZoomFrame(float var1, float var2, float var3, float var4, ISlide var5, IPPImage var6);

   IZoomFrame insertZoomFrame(int var1, float var2, float var3, float var4, float var5, ISlide var6);

   IZoomFrame insertZoomFrame(int var1, float var2, float var3, float var4, float var5, ISlide var6, IPPImage var7);

   ISectionZoomFrame addSectionZoomFrame(float var1, float var2, float var3, float var4, ISection var5);

   ISectionZoomFrame addSectionZoomFrame(float var1, float var2, float var3, float var4, ISection var5, IPPImage var6);

   ISectionZoomFrame insertSectionZoomFrame(int var1, float var2, float var3, float var4, float var5, ISection var6);

   ISectionZoomFrame insertSectionZoomFrame(int var1, float var2, float var3, float var4, float var5, ISection var6, IPPImage var7);

   ISummaryZoomFrame addSummaryZoomFrame(float var1, float var2, float var3, float var4);

   ISummaryZoomFrame insertSummaryZoomFrame(int var1, float var2, float var3, float var4, float var5);

   IVideoFrame addVideoFrame(float var1, float var2, float var3, float var4, String var5);

   IVideoFrame addVideoFrame(float var1, float var2, float var3, float var4, IVideo var5);

   IVideoFrame insertVideoFrame(int var1, float var2, float var3, float var4, float var5, String var6);

   IAudioFrame addAudioFrameCD(float var1, float var2, float var3, float var4);

   IAudioFrame insertAudioFrameCD(int var1, float var2, float var3, float var4, float var5);

   IAudioFrame addAudioFrameLinked(float var1, float var2, float var3, float var4, String var5);

   IAudioFrame insertAudioFrameLinked(int var1, float var2, float var3, float var4, float var5, String var6);

   IAudioFrame addAudioFrameEmbedded(float var1, float var2, float var3, float var4, InputStream var5);

   IAudioFrame addAudioFrameEmbedded(float var1, float var2, float var3, float var4, IAudio var5);

   IAudioFrame insertAudioFrameEmbedded(int var1, float var2, float var3, float var4, float var5, InputStream var6);

   IAudioFrame insertAudioFrameEmbedded(int var1, float var2, float var3, float var4, float var5, IAudio var6);

   int indexOf(IShape var1);

   IShape[] toArray();

   IShape[] toArray(int var1, int var2);

   void reorder(int var1, IShape var2);

   void reorder(int var1, IShape... var2);

   IAutoShape addAutoShape(int var1, float var2, float var3, float var4, float var5);

   IAutoShape addAutoShape(int var1, float var2, float var3, float var4, float var5, boolean var6);

   IAutoShape addMathShape(float var1, float var2, float var3, float var4);

   IAutoShape insertAutoShape(int var1, int var2, float var3, float var4, float var5, float var6);

   IAutoShape insertAutoShape(int var1, int var2, float var3, float var4, float var5, float var6, boolean var7);

   IGroupShape addGroupShape();

   IGroupShape addGroupShape(ISvgImage var1, float var2, float var3, float var4, float var5);

   IGroupShape insertGroupShape(int var1);

   IConnector addConnector(int var1, float var2, float var3, float var4, float var5);

   IConnector addConnector(int var1, float var2, float var3, float var4, float var5, boolean var6);

   IConnector insertConnector(int var1, int var2, float var3, float var4, float var5, float var6);

   IConnector insertConnector(int var1, int var2, float var3, float var4, float var5, float var6, boolean var7);

   IPictureFrame addPictureFrame(int var1, float var2, float var3, float var4, float var5, IPPImage var6);

   IPictureFrame insertPictureFrame(int var1, int var2, float var3, float var4, float var5, float var6, IPPImage var7);

   ITable addTable(float var1, float var2, double[] var3, double[] var4);

   ITable insertTable(int var1, float var2, float var3, double[] var4, double[] var5);

   void removeAt(int var1);

   void remove(IShape var1);

   void clear();

   IShape addClone(IShape var1, float var2, float var3, float var4, float var5);

   IShape addClone(IShape var1, float var2, float var3);

   IShape addClone(IShape var1);

   IShape insertClone(int var1, IShape var2, float var3, float var4, float var5, float var6);

   IShape insertClone(int var1, IShape var2, float var3, float var4);

   IShape insertClone(int var1, IShape var2);
}
